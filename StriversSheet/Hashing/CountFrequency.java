package StriversSheet.Hashing;
import java.util.*;
public class CountFrequency {
    static void countFreq(int nums[]){
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
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 5, 4, 2, 1};
        countFreq(nums);
    }
}
