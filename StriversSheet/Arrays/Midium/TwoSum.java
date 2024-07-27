package StriversSheet.Arrays.Midium;
import java.util.*;
public class TwoSum {
    static void sum(int nums[], int n, int x){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[i] + nums[j] == x){
                    System.out.println(i +" & "+j);
                }
            }
        }
    }
    static int[] sumOpt(int nums[], int n, int x){
        int ans[] = new int[2];
        ans[0] = ans[1] = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            int num = nums[i];
            int moreNeed = x - num;
            if(map.containsKey(moreNeed)){
                ans[0] = map.get(moreNeed);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {2, 3, 5, 8, 9,11};
        int n = nums.length;
        int ans[] = sumOpt(nums, n, 17);
        System.out.println(ans[0]+" & "+ans[1]);
    }
}
