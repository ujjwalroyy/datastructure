package StriversSheet.Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BipartateGraph {
    static boolean isBipartate(int V, ArrayList<ArrayList<Integer>> adj){
        int color[] = new int[V];
        Arrays.fill(color, -1);
        for(int i = 0; i < V; i++){
            if(dfs(i, 0, color, adj) == false){
                return false;
            }
        }
        return true;
    } 
    static boolean dfs(int node, int clr, int color[], ArrayList<ArrayList<Integer>> adj){
        color[node] = clr;
        for(int it : adj.get(node)){
            if(dfs(it, 1 - clr, color, adj) == false){
                return false;
            }
            else if(color[it] == clr){
                return false;
            }
        }
        return true;
    }
    static boolean isBip(int v, ArrayList<ArrayList<Integer>> adj){
        int color[] = new int[v];
        Arrays.fill(color,-1);
        for(int i = 0; i < v; i++){
            if(color[i] == -1){
                if(bfs(i, color, adj) == false){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean bfs(int src, int color[], ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        color[src] = 0;
        q.add(src);
        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            for(int it : adj.get(node)){
                if(color[it] == -1){
                    color[it] = 1 - color[node];
                }
                else if(color[it] == color[node]){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < 4; i++){
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        boolean ans = isBipartate(4, adj);
        System.out.println(ans);
    }
}
