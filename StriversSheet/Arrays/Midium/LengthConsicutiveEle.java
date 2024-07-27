package StriversSheet.Arrays.Midium;
import java.util.*;
public class LengthConsicutiveEle {
    static int lengthEle(int nums[], int n){
        Arrays.sort(nums);
        int maxi = 0;
        int cnt = 1;
        for(int i = 1; i < n; i++){
            if(nums[i] - nums[i-1] == 1){
                cnt += 1;
            }
            else{
                cnt = 0;
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
    
    public static void main(String[] args) {
        int nums[] = {1, 3, 2, 5, 4, 6, 9, 7, 8}; // 1, 2, 3, 4, 5, 7, 8, 9
        int n = nums.length;
        System.out.println(lengthEle(nums, n));
    }
}
