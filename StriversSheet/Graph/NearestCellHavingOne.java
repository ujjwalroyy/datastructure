package StriversSheet.Graph;

import java.util.LinkedList;
import java.util.Queue;


public class NearestCellHavingOne {
    static int[][] nearest(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        int dist[][] = new int[n][m];
        Queue<Tuple> q = new LinkedList<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    q.add(new Tuple(i, j, 0));
                    vis[i][j] = 1;
                }
            }
        }
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};
        while(!q.isEmpty()){
            int row = q.peek().first;
            int col = q.peek().second;
            int step = q.peek().third;
            q.remove();
            dist[row][col] = step;
            for(int i = 0; i < 4; i++){
                int nrow = row + delrow[i];
                int ncol = col + delcol[i];
                if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0){
                    vis[nrow][ncol] = 1;
                    q.add(new Tuple(nrow, ncol, step+1));
                }
            }
        }
        return dist;
    }
    static class Tuple{
        int first;
        int second;
        int third;
        Tuple(int f, int s, int t){
            this.first = f;
            this.second = s;
            this.third = t;
        }
    }
    public static void main(String[] args) {
        int grid[][] = {{0, 1, 1, 0}, {1, 1, 0, 0}, {0, 0, 1, 1}};
        int ans[][] = nearest(grid);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
