package DP;
import java.util.*;
public class GridUniquePath2 {
    static int solutionTailRec(int nums[][], int i, int j){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(i > 0 && j > 0 && nums[i][j] == -1){
            return 0;
        }
        int up = solutionTailRec(nums, i-1, j);
        int left = solutionTailRec(nums, i, j-1);
        return up + left;
    }
    static int solutionTailMem(int nums[][], int i, int j, int dp[][]){
        if(i == 0 && j == 0){
            return 1;
        }
        if(i < 0 || j < 0){
            return 0;
        }
        if(i > 0 && j > 0 && nums[i][j] == -1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int up = solutionTailMem(nums, i-1, j, dp);
        int left = solutionTailMem(nums, i, j-1, dp);
        dp[i][j] = up + left;
        return dp[i][j];
    }
    static int solutionHeadRec(int nums[][], int i, int j){
        if(i == nums.length-1 && j == nums[0].length-1){
            return 1;
        }
        if(i > nums.length-1 || j > nums[0].length-1){
            return 0;
        }
        if(i < nums.length-1 && j < nums[0].length-1 && nums[i][j] == -1){
            return 0;
        }
        int down = solutionHeadRec(nums, i+1, j);
        int right = solutionHeadRec(nums, i, j+1);
        return down + right;
    }
    static int solutionHeadMem(int nums[][], int i, int j, int dp[][]){
        if(i == nums.length-1 && j == nums[0].length-1){
            return 1;
        }
        if(i > nums.length-1 || j > nums[0].length-1){
            return 0;
        }
        if(i < nums.length-1 && j < nums[0].length-1 && nums[i][j] == -1){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        int down = solutionHeadRec(nums, i+1, j);
        int right = solutionHeadRec(nums, i, j+1);
        dp[i][j] = down + right;
        return dp[i][j];
    }
    static int solutionTab(int nums[][], int dp[][]){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums[0].length; j++){
                if(i == 0 && j == 0){
                    dp[i][j] = 1;
                    continue;
                }
                if(i > 0 && j > 0 && nums[i][j] == -1){
                    dp[i][j] = 0;
                    continue;
                }
                int up = 0;
                int left = 0;
                if(i > 0){
                    up = dp[i-1][j];
                }
                if(j > 0){
                    left = dp[i][j-1];
                }
                dp[i][j] = up + left;
            }
        }
        return dp[nums.length-1][nums[0].length-1];
    }
    static int spaceOpt(int nums[][]){
        int prev[] = new int[nums[0].length];
        for(int i = 0; i < nums.length; i++){
            int curr[] = new int[nums[0].length];
            for(int j = 0; j < nums[0].length; j++){
                if(i == 0 && j == 0){
                    curr[j] = 1;
                    continue;
                }
                if(i > 0 && j > 0 && nums[i][j] == -1){
                    curr[j] = 0;
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
            prev = curr.clone();
        }
        return prev[nums[0].length-1];

    }
    public static void main(String[] args) {
        int nums[][] = {{0, 0, 0}, {0, -1, 0}, {0, 0, 0}};
        int dp[][] = new int[nums.length][nums[0].length];
        for(int r[] : dp){
            Arrays.fill(r, -1);
        }
        int tab[][] = new int[nums.length][nums[0].length];
        System.out.println(solutionHeadRec(nums, 0, 0));
        System.out.println(solutionTailRec(nums, nums.length-1, nums[0].length-1));
        System.out.println(solutionTailMem(nums, nums.length-1, nums.length-1, dp));
        System.out.println(solutionHeadMem(nums, 0, 0, dp));
        System.out.println(solutionTab(nums, tab));
        System.out.println(spaceOpt(nums));
    }
}
