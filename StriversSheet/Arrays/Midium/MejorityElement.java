package StriversSheet.Arrays.Midium;
import java.util.*;
public class MejorityElement {
    static int mejElement(int nums[], int n){
        for(int i = 0; i < n; i++){
            int cnt = 1;
            for(int j = i+1; j < n; j++){
                if(nums[i] == nums[j]){
                    cnt += 1;
                }
            }
            if(cnt > (n/2)){
                return nums[i];
            }
        }
        return -1;
    }
    static int mejElementBet(int nums[], int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> it : map.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }
        }
        return -1;
    }
    static int mejElementOpt(int nums[], int n){
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
        if(cnt1 > (n/2)){
            return element;
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 8, 5, 2, 2, 2, 2};
        int n = nums.length;
        System.out.println(mejElement(nums, n));
        System.out.println(mejElementBet(nums, n));
        System.out.println(mejElementOpt(nums, n));
    }
}
