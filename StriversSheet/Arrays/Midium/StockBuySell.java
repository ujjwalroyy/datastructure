package StriversSheet.Arrays.Midium;

public class StockBuySell {
    static int maxProfit(int nums[], int n){
        int profit = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[j] > nums[i]){
                    profit = Math.max(nums[j] - nums[i], profit);
                }
            }
        }
        return profit;
    }
    static int maxProfitOpt(int nums[], int n){
        int maxi = 0;
        int mini = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            mini = Math.min(mini, nums[i]);
            maxi = Math.max(maxi, nums[i] - mini);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = {7, 1, 5, 3, 6, 4};
        int n = nums.length;
        System.out.println(maxProfit(nums, n));
        System.out.println(maxProfitOpt(nums, n));
    }
}
