package DP;

public class SubsetSumTarget {
    static boolean sumTargetRec(int nums[], int target, int i){
        if(target == 0){
            return true;
        }
        if(i == 0){
            return (target == nums[i]);
        }
        boolean take = sumTargetRec(nums, target - nums[i], i-1);
        boolean notTake = sumTargetRec(nums, target, i-1);
        return take || notTake;
    }
    // static boolean sumTargetMen(int nums[], int target, int i, int dp[][]){
    //     if(target == 0){
    //         return true;
    //     }
    //     if(i == 0){
    //         return (target == nums[i]);
    //     }
    //     if(dp[target][i] != -1){
    //         return dp[target][i];
    //     }
    //     boolean take = sumTargetRec(nums, target - nums[i], i-1);
    //     boolean notTake = sumTargetRec(nums, target, i-1);
    //     dp[target][i] = take || notTake ?1:0;
    //     return dp[target][i];
    // }
    public static void main(String[] args) {
        int nums[] = {2, 3, 1, 1};
        System.out.println(sumTargetRec(nums, 8, nums.length-1));
    }
}
