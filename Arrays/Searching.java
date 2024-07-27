import java.util.Arrays;

public class Searching {
    public static int binarySearch(int nums[], int n, int target){
        int low = 0;
        int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] > target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
    static int lowerBound(int[] arr, int value) {
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] <= value) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return ans;
    }
    static int upperBound(int[] arr, int value) {
        int low = 0, high = arr.length-1;
        int ans = arr.length;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > value) {
                ans = mid;
                high = mid -1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
    static int space(int nums[], int s){
        int ans = -1;
        int i = 0, j  = Arrays.stream(nums).sum();
        while(i <= j){
            int mid = i + (j-i)/2;
            if(isCheck(nums,mid, s)){
                ans = mid;
                j = mid-1;
            }
            else{
                i = mid+1;
            }
        }
        return ans;
    }
    static boolean isCheck(int nums[], int mid, int s){
        if(s <= 0){
            return false;
        }
        int sum = 0;
        int currS = 1;
        for(int i = 0; i < nums.length; i++){
            if(sum + nums[i] <= mid){
                sum += nums[i];
            }
            else{
                currS++;
                if(currS > s || i > mid){
                    return false;
                }
                sum = nums[i];
            }
        }
        return true;
    }
    static int cows(int nums[],  int k){
        int n = nums.length;
        int ans= -1;
        Arrays.sort(nums);
        int i = 0; 
        int j = nums[n-1] - nums[0];
        while(i <= j){
            int mid = i + (j-i)/2;
            if(check(nums, mid, k) == true){
                ans = mid;
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return ans;
    }
    static boolean check(int nums[], int mid, int k){
        int nCow = 1; 
        int maci = nums[0]; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - maci >= mid) {
                nCow++;
                maci = nums[i]; 
            }
            if (nCow >= k) return true;
        }
        return false;

    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 6, 7};
        // System.out.println(lowerBound(nums, 7));
        // System.out.println(upperBound(nums, 7));
        System.out.println(space(nums, 2));
    }
}

