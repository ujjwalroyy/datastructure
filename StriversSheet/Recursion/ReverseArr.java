package StriversSheet.Recursion;

public class ReverseArr {
    static void reverse(int nums[], int low, int high){
        if(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            reverse(nums, low+1, high-1);
        }
    }
    static void print(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7};
        int low = 0;
        int high = nums.length;
        reverse(nums, low, high-1);
        print(nums);
    }
}
