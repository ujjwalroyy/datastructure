package StriversSheet.Arrays.Easy;

public class LeftRotateByOne {
    static void rotate(int nums[], int n){
        int temp[] = new int[n];
        for(int i = 1; i < n; i++){
            temp[i-1] = nums[i];
        }
        temp[n-1] = nums[0];
        for(int i = 0; i < nums.length; i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
    static void rotateOpt(int nums[], int n){
        int temp = nums[0];
        for(int i = 1; i < n; i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
    }
    static void printArr(int nums[]){
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 6, 8, 3, 6};
        int n = nums.length;
        rotate(nums, n);
        rotateOpt(nums, n);
        printArr(nums);
    }
}
