package StriversSheet.Arrays.Midium;
import java.util.*;
public class Sort0s1s2s {
    static void sortArr(int nums[], int n){
        Arrays.sort(nums);
    }
    static void printArr(int nums[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
    static void sortArrOpt(int nums[], int n){
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                cnt0 += 1;
            }
            else if(nums[i] == 1){
                cnt1 +=  1;
            }
            else{
                cnt2 += 1;
            }
        }
        for(int i = 0; i < cnt0; i++){
            nums[i] = 0;
        }
        for(int i = cnt0; i < cnt0+cnt1; i++){
            nums[i] = 1;
        }
        for(int i = cnt0+cnt1; i < n; i++){
            nums[i] = 2;
        }
    }
    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 0, 1, 2, 0, 1, 2};
        int n = nums.length;
        sortArrOpt(nums, n);
        printArr(nums, n);
    }
}
