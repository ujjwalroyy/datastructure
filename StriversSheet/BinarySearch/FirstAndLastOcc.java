package StriversSheet.BinarySearch;

public class FirstAndLastOcc {
    static int firstOcc(int nums[], int n, int x){
        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                return i;
            }
        }
        return -1;
    }
    static int firstOccOpt(int nums[], int n, int x){
        int low = 0, high = n-1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low) /2;
            if(nums[mid] == x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
    static int lastOcc(int nums[], int n, int x){
        int ans = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                ans = i;
            }
        }
        return ans;
    }
    static int lastOccOpt(int nums[], int n, int x){
        int low = 0, high = n-1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == x){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3,3, 4, 4, 4, 4, 7, 8, 10};
        int n = nums.length;
        int x = 4;
        System.out.println(firstOcc(nums, n, x));
        System.out.println(firstOccOpt(nums, n, x));
        System.out.println(lastOcc(nums, n, x));
        System.out.println(lastOccOpt(nums, n, x));
    }
}
