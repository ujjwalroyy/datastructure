package StriversSheet.BinarySearch;

public class InsertPosition {
    static int insertPos(int nums[] ,int n, int x){
        int low = 0, high = n-1;
        int ans = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= x){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 4, 7};
        int x = 6;
        System.out.println(insertPos(nums, nums.length, x));
    }
}
