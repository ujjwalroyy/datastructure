package StriversSheet.Arrays.Easy;

public class FindAppearOnce {
    static int appearOnce(int nums[], int n){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            maxi = Math.max(maxi, nums[i]);
        }
        int hash[] = new int[maxi+1];
        for(int i = 0; i < n; i++){
            hash[nums[i]]++;
        }
        for(int i = 0; i < n; i++){
            if(hash[nums[i]] == 1){
                return nums[i];
            }
        }
        return -1;
    }
    static int appearOnceOpt(int nums[], int n){
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 2, 4, 5, 5};
        int n = nums.length;
        System.out.println(appearOnceOpt(nums, n));
    }
}
