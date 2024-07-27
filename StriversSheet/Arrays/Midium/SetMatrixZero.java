
package StriversSheet.Arrays.Midium;

public class SetMatrixZero {
    static int[][] setZero(int mat[][], int n, int m){
        int row[] = new int[n];
        int col[] = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] == 1 || col[j] == 1){
                    mat[i][j] = 0;
                }
            }
        }
        return mat;
    }
    public static void main(String[] args) {
        int mat[][] = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int n = mat.length;
        int m = mat[0].length;
        int ans[][] = setZero(mat, n, m);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(mat[i][j] +" ");
            }
            System.out.println();
        }
    }
}
