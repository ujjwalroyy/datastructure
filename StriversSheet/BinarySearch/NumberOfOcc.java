package StriversSheet.BinarySearch;

/**
 * NumberOfOcc
 */
public class NumberOfOcc {
    static int first(int nums[], int n, int x){
        int low = 0, high = n-1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    static int last(int nums[], int n, int x){
        int low = 0, high = n-1;
        int ans = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] == x){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    static int numOcc(int nums[], int n, int x){
        int f = first(nums, n, x);
        int l = last(nums, n, x);
        return (l - f)+1;
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 4, 4, 4, 7, 8, 10};
        int n = nums.length;
        int x = 4;
        int ans = numOcc(nums, n, x);
        System.out.println(ans);
    }
}