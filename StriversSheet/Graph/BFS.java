package StriversSheet.Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<Integer> list = new ArrayList<>();
        boolean vis[] = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        vis[0] = true;
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            list.add(node);
            for(int it : adj.get(node)){
                if(vis[it] == false){
                    q.add(it);
                    vis[it] = true;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
    }
}
