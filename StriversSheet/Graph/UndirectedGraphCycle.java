package StriversSheet.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class UndirectedGraphCycle {
    static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[V];
        for(int i = 0; i < V; i++){
            if(vis[i] == false){
                if(check(i, V, adj, vis)){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean check(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean vis[]){
        Queue<Pair> q = new LinkedList<>();
        vis[src] = true;
        q.add(new Pair(src, -1));
        while(!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();
            for(int it : adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(new Pair(it, node));
                }
                else if(parent != it){
                    return true;
                }
            }
        }
        return false;
    }
    static class Pair{
        int first;
        int second;
        Pair(int f, int s){
            this.first = f;
            this.second = s;
        }
    }
}
