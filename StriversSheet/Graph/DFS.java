package StriversSheet.Graph;

import java.util.ArrayList;

public class DFS {
    static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean vis[], ArrayList<Integer> list){
        vis[node] = true;
        list.add(node);
        for(int it : adj.get(node)){
            if(vis[it] == false){
                dfs(it, adj, vis, list);
            }
        }
    }
    public static void main(String[] args) {
        int v = 8;
        
    }
}
