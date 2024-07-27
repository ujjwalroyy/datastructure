package StriversSheet.Arrays.Hard;

public class ThreeSum {
    static void threeSum(int nums[], int n){
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int k = j+1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        System.out.print(nums[i] +" "+nums[j] +" "+nums[k]);
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {-1, 0, 1, 2, -1, -4};
        int n = nums.length;
        threeSum(nums, n);
    }
}
