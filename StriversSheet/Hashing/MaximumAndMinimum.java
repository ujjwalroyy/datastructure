package StriversSheet.Hashing;

import java.util.*;
public class MaximumAndMinimum {
    static void countMaxMin(int nums[]){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" --> "+entry.getValue());
        }
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            mini = Math.min(mini, entry.getValue());
            maxi = Math.max(maxi, entry.getValue());
        }
        System.out.println("Maximum Freq --> "+maxi);
        System.out.println("Minimum Freq --> "+mini);
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 3, 2, 2, 4, 4, 5, 5, 5, 2};
        countMaxMin(nums);
    }
}
