package StriversSheet.Arrays.Easy;
import java.util.*;
public class SecondLargest {
    static int secLarge(int nums[], int n){
        Arrays.sort(nums);
        return nums[n-2];
    }
    static int secLargeOpt(int nums[], int n){
        int ans = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            largest = Math.max(largest, nums[i]);
        }
        for(int i = 0; i < n; i++){
            if(nums[i] != largest){
                ans = Math.max(ans, nums[i]);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3, 6, 2, 8, 7, 5, 9};
        int n = nums.length;
        System.out.println(secLarge(nums, n));
    }
}
