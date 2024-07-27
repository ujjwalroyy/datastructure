package StriversSheet.Arrays.Midium;

public class RearrangeArray {
    static int[] arrange(int nums[], int n){
        int pos[] = new int[n/2];
        int neg[] = new int[n/2];
        int j = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] > 0) pos[i] = nums[i];
            else neg[j++] = nums[i];
        }
        for(int i = 0; i < n/2; i++){
            nums[2*i] = pos[i];
            nums[2*i+1] = neg[i];
        }
        return nums;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, -4, -5, -6};
        int n = nums.length;
        int ans[] = arrange(nums, n);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i]+" ");
        }
    }
}
