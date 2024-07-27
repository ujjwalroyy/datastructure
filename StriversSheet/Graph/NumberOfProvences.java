package StriversSheet.Graph;
import java.util.ArrayList;

public class NumberOfProvences {
    
    static int numOfProvinces(ArrayList<ArrayList<Integer>> adj, int V){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adjList.add(new ArrayList<>());
        }
        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(adj.get(i).get(j) == 1 && i != j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int vis[] = new int[V];
        int cnt = 0;
        for(int i = 0; i < V; i++){
            if(vis[i] == 0){
                cnt++;
                dfs(i, adjList, vis);
            }
        }
        return cnt;
    }
    static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int vis[]){
        vis[node] = 1;
        for(int it : adjList.get(node)){
            if(vis[it] == 0){
                dfs(node, adjList, vis);
            }
        }
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        adj.get(0).add(0, 1);
        adj.get(0).add(1, 0);
        adj.get(0).add(2, 1);
        adj.add(new ArrayList<>());
        adj.get(1).add(0, 0);
        adj.get(1).add(1, 1);
        adj.get(1).add(2, 0);
        adj.add(new ArrayList<>());
        adj.get(2).add(0, 1);
        adj.get(2).add(1, 0);
        adj.get(2).add(2, 1);
        System.out.println(numOfProvinces(adj, 3));
    }
}
