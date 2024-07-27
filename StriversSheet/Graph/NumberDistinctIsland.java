package StriversSheet.Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class NumberDistinctIsland {
    static int cntIsland(int mat[][]){
        int n = mat.length;
        int m = mat[0].length;
        int vis[][] = new int[n][m];
        HashSet<ArrayList<String>> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(vis[i][j] == 0 && mat[i][j] == 1){
                    ArrayList<String> list = new ArrayList<>();
                    dfs(i, j, vis, mat, list, i, j);
                    set.add(list);
                }
            }
        }
        return set.size();
    }
    static void dfs(int row, int col, int vis[][], int mat[][], ArrayList<String> list, int rowC, int colC){
        vis[row][col] = 1;
        list.add(toString(row - rowC, col - colC));
        int n = mat.length;
        int m = mat[0].length;
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};
        for(int i = 0; i < 4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && mat[nrow][ncol] == 1){
                dfs(nrow, ncol, vis, mat, list, rowC, colC);
            }
        }
    }
    static String toString(int r, int c){
        return Integer.toString(r)+" "+Integer.toString(c);
    }
    public static void main(String[] args) {
        int mat[][] = {{1,1,0,1,1}, {1,0,0,0,0}, {0,0,0,1,1}, {1,1,0,1,0}};
        System.out.println("Number of Distinct island : "+cntIsland(mat));
    }
}
