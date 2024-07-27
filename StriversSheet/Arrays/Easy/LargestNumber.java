package StriversSheet.Arrays.Easy;
import java.util.*;
public class LargestNumber {
    static int largest(int nums[], int n){
        Arrays.sort(nums);
        return nums[n-1];
    }
    static int largestOpt(int nums[], int n){
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, nums[i]);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3, 6, 2, 8, 7, 5};
        int n = nums.length;
        System.out.println(largest(nums, n));
        System.out.println(largestOpt(nums, n));
    }
}
