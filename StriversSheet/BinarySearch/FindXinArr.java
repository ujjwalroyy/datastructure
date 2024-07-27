package StriversSheet.BinarySearch;

public class FindXinArr {
    static int binarySearch(int nums[], int x){
        int low = 0, high = nums.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == x){
                return mid;
            }
            else if(x > nums[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    static int binarySearchRec(int nums[], int low, int high, int x){
        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == x){
                return mid;
            }
            else if(x > nums[mid]){
                binarySearchRec(nums, mid+1, high, x);
            }
            else{
                binarySearchRec(nums, low, mid, x);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {3, 4, 6, 7, 9, 12, 16, 17};
        int x = 116;
        int ans = binarySearch(nums, x);
        if(ans == -1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
    }
}
