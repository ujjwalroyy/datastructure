package StriversSheet.BinarySearch;

public class FloorAndCeilValue {
    static int floorValue(int nums[], int n, int x){
        int low = 0, high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] <= x){
                ans = nums[mid];
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    static int ceilValue(int nums[], int n, int x){
        int low = 0, high = n-1;
        int ans = -1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= x){
                ans = nums[mid];
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 4, 7, 8, 10};
        int n = nums.length;
        int x = 5;
        System.out.println(floorValue(nums, n, x));
        System.out.println(ceilValue(nums, n, x));
    }
}
