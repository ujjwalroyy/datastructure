package StriversSheet.BinarySearch;

public class LowerBound {
    static int lowerBound(int nums[], int n, int x){
        for(int i = 0; i < n; i++){
            if(nums[i] >= x){
                return i;
            }
        }
        return n;
    }
    static int lowerBoundOpt(int nums[], int n, int x){
        int low = 0;
        int high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid +1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {3, 5, 8, 15, 19};
        int n = nums.length;
        System.out.println(lowerBound(nums, n, 9));
        System.out.println(lowerBoundOpt(nums, n, 9));
    }
}
