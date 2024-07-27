package StriversSheet.Arrays.Midium;

public class SpiralTraversal {
    static int[] spiral(int mat[][], int n, int m){
        int ans[] = new int[n*m];
        int cnt = 0;
        int top = 0, left = 0, bottom = n-1, right = m-1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++){
                ans[cnt++] = mat[top][i];
            }
            top++;
            for(int i = top; i <= bottom; i++){
                ans[cnt++] = mat[i][right];
            }
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    ans[cnt++] = mat[bottom][i];
                }
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    ans[cnt++] = mat[i][left];
                }
                left++;
            }
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int n = mat.length;
        int m = mat[0].length;
        int ans[] = spiral(mat, n, m);
        for(int i = 0; i < (n*m); i++){
            System.out.print(ans[i]+" ");
        }
    }
}
