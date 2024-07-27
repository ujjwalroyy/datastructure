package StriversSheet.Arrays.Midium;


public class RotateBy90d {
    static int[][] rotate(int mat[][], int n, int m){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < m; j++){
                swap(mat[i][j], mat[j][i]);
            }
        }
        for(int i = 0; i < n; i++){
            int low = 0, high = n-1;
            while(low < high){
                swap(mat[low][i], mat[high][i]);
                low++;
                high--;
            }
        }
        return mat;
    }
    static void swap(int i, int j){
        int temp = i;
        i = j;
        j = temp;
    }
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3},  // 7, 4, 1
                       {4, 5, 6},  // 8, 5, 2
                       {7, 8, 9}}; // 9, 6, 3
        int n = mat.length;
        int m = mat[0].length;
        int ans[][] = rotate(mat, n, m);
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
