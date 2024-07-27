package StriversSheet.Arrays.Easy;

public class LeftRotateByD {
    static void rotateByD(int nums[], int n, int d){
        reverse(nums, 0, d-1);
        reverse(nums, d, n-1);
        reverse(nums, 0, n-1);
    }
    static void reverse(int nums[], int low, int high){
        while(low <= high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = nums.length;
        rotateByD(nums, n, 2);
        printArr(nums);
    }
}
