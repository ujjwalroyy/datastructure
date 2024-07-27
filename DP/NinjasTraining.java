package DP;

import java.util.Arrays;

public class NinjasTraining {
    static int training(int nums[][], int last, int day){
        if(day == 0){
            int maxi = Integer.MIN_VALUE;
            for(int i = 0; i <= 2; i++){
                if(i != last){
                    maxi = Math.max(maxi, nums[0][i]);
                }
            }
            return maxi;
        }
        int maxi = 0;
        for(int i = 0; i <= 2; i++){
            if(i != last){
                int action = nums[day][i] + training(nums, i, day-1);
                maxi = Math.max(maxi, action);
            }
        }
        return maxi;
    }
    static int trainingMem(int nums[][], int last, int day, int dp[][]){
        if(day == 0){
            int maxi = Integer.MIN_VALUE;
            for(int i = 0; i <= 2; i++){
                if(i != last){
                    maxi = Math.max(maxi, nums[0][i]);
                }
            }
            return dp[day][last] = maxi;
        }
        if(dp[day][last] != -1){
            return dp[day][last];
        }
        int maxi = 0;
        for(int i = 0; i <= 2; i++){
            if(i != last){
                int action = nums[day][i] + trainingMem(nums, i, day-1, dp);
                maxi = Math.max(maxi, action);
            }
        }
        return dp[day][last] = maxi;
    }
    
    public static void main(String[] args) {
        int tasks[][] = {{2, 1, 3},
                        {3, 4, 6},
                        {10, 1, 6},
                        {8, 3, 7}};
        int n = tasks.length;
        int m = tasks[0].length;
        int dp[][] = new int[n+1][m+1];
        for(int r[] : dp){
            Arrays.fill(r, -1);
        }
        System.out.println(trainingMem(tasks, 3, 3, dp));
    }
}
