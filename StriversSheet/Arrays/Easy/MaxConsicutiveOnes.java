package StriversSheet.Arrays.Easy;

public class MaxConsicutiveOnes {
    static int maxOnes(int nums[], int n){
        int cnt = 0;
        int maxi = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                cnt += 1;
            }
            else{
                cnt = 0;
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 0, 1, 1, 1};
        int n = nums.length;
        System.out.println(maxOnes(nums, n));
    }
}
