package StriversSheet.Arrays.Easy;
import java.util.*;
public class RemoveDuplicates {
    static int removeDup(int nums[], int n){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums[i]);
        }
        return set.size();
    }
    static int removeDupOpt(int nums[], int n){
        int cnt = 0;
        for(int j = 1; j < n; j++){
            if(nums[cnt] != nums[j]){
                cnt++;
                nums[cnt] = nums[j];
            }
        }
        return cnt+1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 2, 2, 3, 3, 4, 4, 5, 6};
        int n = nums.length;
        System.out.println(removeDup(nums, n));
        System.out.println(removeDupOpt(nums, n));
    }
}
