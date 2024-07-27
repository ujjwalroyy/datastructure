package StriversSheet.Arrays.Easy;
import java.util.*;
public class FindUnion {
    static void unionArr(int nums1[], int nums2[], int n, int m){
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(nums1[i]);
        }
        for(int i = 0; i < m; i++){
            set.add(nums2[i]);
        }
        for(int i : set){
            System.out.print(i+" ");
        }
    }
    static int[] unionArrOpt(int nums1[], int nums2[], int n, int m){
        int i = 0;
        int j = 0;
        int ans[] = new int[n+m];
        while(i < n && j < m){
            if(nums1[i] <= nums2[j]){
                if(ans[i-1] != nums1[i] || ans[0] == 0){
                    ans[i] = nums1[i];
                }
                i++;
            }
            else{
                if(ans[0] == 0 || ans[i-1] != nums2[j]){
                    ans[i] = nums2[j];
                }
                j++;
            }
            while(i < n){
                if(ans[i-1] != nums1[i]){
                    ans[i] = nums1[i];
                }
                i++;
            }
            while(j < m){
                if(ans[i-1] != nums2[j]){
                    ans[i] = nums2[j];
                }
                j++;
            }
        }
        return ans;
    }
    static void printArr(int nums[]){
        for(int i : nums){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int nums1[] = {1, 3, 5, 7, 9, 11};
        int nums2[] = {1, 2, 5, 6, 9, 10};
        int n = nums1.length;
        int m = nums2.length;
        unionArrOpt(nums1, nums2, n, m);
    }
}
