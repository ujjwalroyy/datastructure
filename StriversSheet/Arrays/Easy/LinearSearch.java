package StriversSheet.Arrays.Easy;

public class LinearSearch {
    static int search(int nums[], int n, int x){
        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {2, 4, 5, 7, 9};
        int n = nums.length;
        System.out.println(search(nums, n, 5));
    }
}
