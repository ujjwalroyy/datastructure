package Basic;
import java.util.ArrayList;
import java.util.List;

public class Recursion_2 {
    static void print(int n, int i){
        if(i == 0){
            return;
        }
        System.out.println(i);
        print(n, i-1);  
    }
    static void printPar(int n, String ans, int cnt1, int cnt2 ){
        if(n == 0 || cnt1 < cnt2){
            System.out.println(ans);
            return;
        }
        printPar(n-1, ans+"(", cnt1+1, cnt2);
        printPar(n-1, ans+")", cnt1, cnt2+1);
    }
 

    static void gP(int n, int open, int close, String ans){
        if(open == n && close ==n){
        System.out.println(ans+" ");
        return;
        }
        if(open>n||close>open){
            return;
        }
        gP(n, open+1, close, ans+"(");
        gP(n, open, close+1, ans+")");
     }
     
     static void reverseString(String s, int i, String ans){
        if(i < 0){
            System.out.println(ans);
            return;
        }
        char ch = s.charAt(i);
        reverseString(s, i-1, ans + ch);
     }

     static int findMean(int nums[], int ans, int i){
        if(i < 0){
            return ans/nums.length;
        }
        return findMean(nums, ans+nums[i], i-1);
     }


     static void subsetsRec(int[] nums, List<Integer> current, List<List<Integer>> ans, int itr){
        //basse
        if(itr == nums.length){
            ans.add(current);
            return;
        }
        //not go
        subsetsRec(nums,current,ans,itr+1); 
        //go
        current.add(nums[itr]);
        subsetsRec(nums,current,ans,itr+1);

    }
    static void swap(int a[]){
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }

    public static void main(String[] args) {
        // gP(3, 0, 0, " ");
        // String s = "Hello";
        // reverseString(s, s.length()-1, "" );
        int nums[] = {1, 2,3 ,4};
        swap(nums);
        System.out.println(nums[0]);
        // int n = nums.length;
        // List<Integer> curr = new ArrayList<>();
        // List<List<Integer>> ans = new ArrayList<>();
        // subsetsRec(nums, curr, ans, 0);
        // System.out.println(ans);
        // int a = 3;
        // int b = 5;
        // swap(3, 5);
        // System.out.println("a :"+a);
        // System.out.println("b :"+b);
    }
}