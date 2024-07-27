package StriversSheet.Arrays.Midium;

public class MaxSubArrSum {
    static int maxSum(int nums[], int n){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += nums[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
    static int maxSumBet(int nums[], int n){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
    static int maxSumOpt(int nums[], int n){
        int maxi = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
            maxi = Math.max(maxi, sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = nums.length;
        System.out.println(maxSum(nums, n));
        System.out.println(maxSumBet(nums, n));
        System.out.println(maxSumOpt(nums, n));
    }
}
