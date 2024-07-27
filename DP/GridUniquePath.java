package DP;


public class GridUniquePath {
    
    static int solution(int nums[][], int i, int j){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        int up = solution(nums, i-1, j);
        int left = solution(nums, i, j-1);
        return up + left;
    }
    static int solutionMem(int nums[][], int i, int j, int dp[][]){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = solutionMem(nums, i-1, j, dp);
        int left = solutionMem(nums, i, j-1, dp);
        dp[i][j] = up + left;
        return dp[i][j];
    }
    static int solutionTab(int nums[][], int dp[][]){
        dp[0][0] = 1;
        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){
                int up = dp[i-1][j];
                int left = dp[i][j-1];
                dp[i][j] = up + left;
            }
        }
        return dp[1][2];
    }
    static int spcOpt(int n, int m){
        int prev[] = new int[m];
        for(int i = 0; i < n; i++){
            int curr[] = new int[m];
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0){
                    curr[j] = 1;
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i > 0){
                    up = prev[j];
                }
                if(j > 0){
                    left = curr[j-1];
                }
                curr[j] = up + left;
            }
            prev = curr;
        }
        return prev[m-1];
    }
    public static void main(String[] args) {
        int nums[][] = new int[1][2];
        int dp[][] = new int[2][3];
        System.out.println(spcOpt(3, 3));
    }
}
