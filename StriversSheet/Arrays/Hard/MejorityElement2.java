package StriversSheet.Arrays.Hard;
import java.util.*;
public class MejorityElement2 {
    static void mejElement(int nums[], int n){
        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = i+1; j < n; j++){
                if(nums[i] == nums[j]){
                    cnt += 1;
                }
            }
            if(cnt > (n/3)){
                System.out.print(nums[i]+" ");
            }
        }
        System.out.println();
    }
    static void mejElementBet(int nums[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[1])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> ent : map.entrySet()){
            if(ent.getValue() > n/3){
                System.out.print(ent.getKey()+" ");
            }
        }
    }
    static void mejElementOpt(int nums[], int n){
        int cnt = 0;
        int element = 0;
        for(int i = 0; i < n; i++){
            if(cnt == 0){
                cnt = 1;
                element = nums[i];
            }
            else if(element == nums[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int cnt1 = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == element){
                cnt1++;
            }
        }
        if(cnt1 > (n/3)){
            System.out.print(element+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {11, 33, 11, 33, 33, 11};
        int n = nums.length;
        mejElement(nums, n);
        mejElementBet(nums, n);
        mejElementOpt(nums, n);
    }
}
