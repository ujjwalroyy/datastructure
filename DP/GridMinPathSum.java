package DP;
import java.util.*;
public class GridMinPathSum {
    static int minSumRec(int nums[][], int i, int j){
        if(i == 0 && j == 0){
            return nums[0][0];
        }
        if(i < 0 || j < 0){
            return (int)(1e9);
        }
        int up = nums[i][j] + minSumRec(nums, i-1, j);
        int left = nums[i][j] + minSumRec(nums, i, j-1);
        return Math.min(up, left);
    }
    static int minSumMem(int nums[][], int i, int j, int dp[][]){
        if(i == 0 && j == 0){
            return nums[0][0];
        }
        if(i < 0 || j < 0){
            return (int)(1e9);
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = nums[i][j] + minSumMem(nums, i-1, j, dp);
        int left = nums[i][j] + minSumMem(nums, i, j-1, dp);
        dp[i][j] = Math.min(up, left);
        return dp[i][j];
    }
    static int minSumTab(int nums[][], int dp[][]){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = nums[i][j];
                }
                else{
                    int up = nums[i][j];
                    if(i > 0){
                        up += dp[i-1][j];
                    }
                    else{
                        up += Math.pow(10, 9);
                    }
                    int left = nums[i][j];
                    if(j > 0){
                        left += dp[i][j-1];
                    }
                    else{
                        left += (int)(1e9);
                    }
                    dp[i][j] = Math.min(up, left);
                }
            }
        }
        return dp[nums.length-1][nums[0].length-1];
    }
    static int minSumSpcOpt(int nums[][]){
        int prev[] = new int[nums[0].length];
        int curr[] = new int[nums[0].length];
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(i == 0 && j == 0){
                    curr[j] = nums[i][j];
                }
                else{
                    int up = nums[i][j];
                    if(i > 0){
                        up += prev[j];
                    }
                    else{
                        up += (int)(1e9);
                    }
                    int left = nums[i][j];
                    if(j > 0){
                        left += curr[j-1];
                    }
                    else{
                        left += (int)(1e9);
                    }
                    curr[j] = Math.min(up, left);
                }
                prev = curr;
            }
        }
        return prev[nums[0].length-1];
    }
    public static void main(String[] args) {
        int nums[][] = {{5, 9, 6}, {11, 5, 2}};
        int dp[][] = new int[nums.length][nums[0].length];
        for(int r[] : dp){
            Arrays.fill(r, -1);
        }
        int tab[][] = new int[nums.length][nums[0].length];
        System.out.println("Rec : "+minSumRec(nums, nums.length-1, nums[0].length-1));
        System.out.println("Mem : "+minSumMem(nums, nums.length-1, nums[0].length-1, dp));
        System.out.println("Tab : "+minSumTab(nums, tab));
        System.out.println("SpcOpt : "+minSumSpcOpt(nums));
    }
    
}
