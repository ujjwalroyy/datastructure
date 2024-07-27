package StriversSheet.Graph;

public class FloodFill {
    static int[][] flood(int image[][], int sr, int sc, int newColor){
        int initial = image[sr][sc];
        int ans[][] = image;
        int delrow[] = {-1, 0, 1, 0};
        int delcol[] = {0, 1, 0, -1};
        fill(sr, sc, ans, image, newColor, initial, delrow, delcol);
        return ans;
    }
    static void fill(int row, int col, int ans[][], int image[][], int newColor, int initial, int delcol[], int delrow[]){
        int n = image.length;
        int m = image[0].length;
        ans[row][col] = newColor;
        for(int i = 0; i < 4; i++){
            int nrow = row + delrow[i];
            int ncol = col + delcol[i];
            if(nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && image[nrow][ncol] == initial && ans[nrow][ncol] != newColor){
                fill(nrow, ncol, ans, image, newColor, initial, delcol, delrow);
            }
        }
    }
    public static void main(String[] args) {
        int image[][] = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int ans[][] = flood(image, 1, 1, 2);
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
