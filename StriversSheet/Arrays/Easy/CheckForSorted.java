package StriversSheet.Arrays.Easy;

public class CheckForSorted {
    static boolean isSorted(int nums[], int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[i]){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isSortedOpt(int nums[], int n){
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 5, 7, 8};
        int n = nums.length;
        System.out.println(isSorted(nums, n));
        System.out.println(isSorted(nums, n));
    }
}
