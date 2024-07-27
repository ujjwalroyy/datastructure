package StriversSheet.Graph;

public class SurroundedRegions {
    static void dfs(int row, int col, int vis[][], char grid[][]){
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};
        vis[row][col] = 1;
        for(int i = 0; i < 4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow < grid.length && ncol >= 0 && ncol < grid[0].length && vis[nrow][ncol] == 0 && grid[nrow][ncol] == 'O'){
                dfs(nrow, ncol, vis, grid);
            }
        }
    }
    static char[][] replace(char grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int vis[][] = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 || j == 0 || i == n-1 || j == m-1){
                    if(grid[i][j] == 'O'){
                        vis[i][j] = 1;
                        dfs(i, j, vis, grid);
                    }
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 'O' && vis[i][j] == 0){
                    grid[i][j] = 'X';
                }
            }
        }
        return grid;
    }
    public static void main(String[] args) {
        char grid[][] = {{'O', 'X', 'X'}, {'X', 'O', 'X'}, {'X', 'X', 'X'}};
        char ans[][] = replace(grid);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j ++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
