
import java.util.*;
public class ArraysQue {
    static int largestEle(int nums[], int n){
        int res = 0;
        for(int i = 1; i < n; i++){
            if(nums[res] < nums[i]){
                res = i;
            }
        }
        return res;
    }
    static int smallestEle(int nums[], int n){
        int res = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[res]){
                res = i;
            }
        }
        return res;
    }
    static boolean isSorted(int nums[], int n){
        for(int i = 1; i < n; i++){
            if(nums[i] < nums[i-1]){
                return false;
            }
        }
        return true;
    }
    static int leftRotate(int nums[], int n){
        int temp = nums[0];
        for(int i = 1; i < n; i++){
            nums[i-1] = nums[i];
        }
        nums[n-1] = temp;
        return nums[n-1];
    }
    static int leftRotateByD(int nums[], int n, int d){
        reverseArr(nums, 0, d-1);
        reverseArr(nums, d, n-1);
        reverseArr(nums, 0, n-1);
        return nums[0];
    }
    static void moveZeroToEnd(int nums[], int n){
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                for(int j = i+1; j < n; j++){
                    if(nums[j] != 0){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
    }
    static void printArr(int nums[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
    static void move0ToEndEff(int nums[], int n){
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[cnt];
                nums[cnt] = temp;
                cnt++;
            }
        }
    }
    static int linearSearch(int nums[], int n, int x){
        for(int i = 0; i < n; i++){
            if(nums[i] == x){
                return i;
            }
        }
        return -1;
    }
    static int findUnion(int nums1[], int nums2[], int n1, int n2){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n1; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < n2; i++){
            set.add(nums2[i]);
        }
        return set.size();
    }
    static int findMissing(int nums[] ,int n){
        int nSum = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += nums[i];
        }
        int missing = nSum - sum;
        return missing;
    }
    static int maxConsecutiveOnes(int nums[], int n){
        int maxi = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                cnt++;
            }
            else{
                cnt = 0;
            }
            maxi = Math.max(maxi, cnt);
        }
        return maxi;
    }
    static int appearOnce(int nums[], int n){
        int xor = 0;
        for(int i = 0; i < n; i++){
            xor = xor ^ nums[i];
        }
        return xor;
    }
    static int findSumInRange(int nums[], int s, int e){
        int sum = 0;
        for(int i = s; i <= e; i++){
            sum += nums[i];
        }
        return sum;
    }
    static int findLargestInRange(int nums[], int s, int e){
        int largest = 0;
        for(int i = s; i <= e; i++){
            if(nums[largest] < nums[i]){
                largest = i;
            }
        }
        return largest;
    }
    static int findSmallestInRange(int nums[], int s, int e){
        int smallest = 0;
        for(int i = s; i <= e; i++){
            if(nums[smallest] > nums[i]){
                smallest = i;
            }
        }
        return smallest;
    }
    static void reverseArr(int nums[], int low, int high){
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
    static void findLast(int []nums, int key){
        int pos = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key){
                pos = i;
            }
        }
        System.out.println(pos);
        return;
    }
    static void rotate1ByRight(int nums[]){
        int temp = nums[nums.length-1];
        for(int i = nums.length-1; i > 0; i--){
            nums[i] = nums[i-1];
        }
        nums[0] = temp;
    }
    static void rotateDByRight(int nums[], int d){
        for(int i = 0; i < d; i++){
            rotate1ByRight(nums);
        }
    }
    static void rotate_D_ByRight(int nums[], int d){
        int n = nums.length;
        reverseArr(nums, 0, d-1);
        reverseArr(nums, d, n-1);
        reverseArr(nums, 0, n-1);
        printArr(nums, n);
    }
    public static void main(String[] args) {
        int nums[] = {2, 5, 16, 19, 39, 49, 58};
        int n = nums.length;
        // rotate_D_ByRight(nums, 2);
        Searching s = new Searching();
        System.out.println(s.binarySearch(nums, n, 39));
        
    }
}
