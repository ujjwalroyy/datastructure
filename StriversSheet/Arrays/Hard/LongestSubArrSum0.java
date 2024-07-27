package StriversSheet.Arrays.Hard;

public class LongestSubArrSum0 {
    static int subArr(int nums[], int n){
        int maxi = 0;
        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];
                if(sum == 0){
                    maxi = Math.max(maxi, j-i+1);
                }
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = {9, -3, 3, -1, 6, -5};
        System.out.println(subArr(nums, nums.length));
    }
}
