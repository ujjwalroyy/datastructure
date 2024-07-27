package StriversSheet.Arrays.Hard;

import java.util.HashMap;

public class NumberOfSubArrXORk {
    static int cntXORk(int nums[], int n, int target){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int xor = 0;
                for(int k = i; k <= j; k++){
                    xor = xor ^ nums[k];
                }
                if(xor == target){
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    static int cntXORkBet(int nums[], int n, int target){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            int xor = 0;
            for(int j = i; j < n; j++){
                xor = xor ^ nums[j];
                if(xor == target){
                    cnt += 1;
                }
            }
        }
        return cnt;
    }
    static int cntXORkOpt(int nums[], int n, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int xor = 0;
        map.put(xor, 1);
        int cnt = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ nums[i];
            int x = xor ^ target;
            if(map.containsKey(x)){
                cnt += map.get(x);
            }
            if(map.containsKey(xor)){
                map.put(xor, map.get(xor)+1);
            }
            else{
                map.put(xor, 1);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int nums[] = {4, 2, 2, 6, 4};
        int target = 6;
        System.out.println(cntXORk(nums, nums.length, target));
        System.out.println(cntXORkBet(nums, nums.length, target));
        System.out.println(cntXORkOpt(nums, nums.length, target));
    }
}
