package StriversSheet.Arrays.Easy;

public class MoveZeroAtEnd {
    static void moveZero(int nums[], int n){
        int ans[] = new int[n];
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                ans[cnt++] = nums[i];
            }
        }
        for(int i = cnt; i < n; i++){
            ans[i] = 0;
        }
        for(int i = 0; i < n; i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
    static int[] moveZeroOpt(int nums[], int n){
        int j = -1;
        for(int i = 0; i < n; i++){
            if(nums[i]== 0){
                j = i;
                break;
            }
        }
        if(j == -1){
            return nums;
        }
        for(int i = j+1; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
    static void printArr(int nums[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {2, 5, 0, 6, 0, 8, 0, 4, 0, 1};
        int n = nums.length;
        moveZero(nums, n);
        moveZeroOpt(nums, n);
        printArr(nums, n);
    }
}
