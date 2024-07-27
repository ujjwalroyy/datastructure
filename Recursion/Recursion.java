package Recursion;
public class Recursion {
    static int fact(int n, int ans){
        // if(n == 1){
        //     return 1;
        // }
        // return n * fact(n-1);
        
        if(n == 0){
            return ans;
        }
        return fact(n-1, ans*n);
    }
    
    static int power(int x, int b){
        int ans = 1;
        for(int i = 0; i < b; i++){
            ans *= x;
        }
        return ans;
    }

    static int recPow(int x, int b){
        if(b == 0){
            return 1;
        }
        return x * recPow(x, b-1);
    }
    static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        
        return fib(n-1)+fib(n-2);
    }
    static void subSeq(String s, int i, String ans){
        if(i == 0){
        }
        subSeq(s, i-1, ans + s.charAt(i));
        subSeq(s, i-1, ans);     
    }
    static int findEle(int nums[], int x){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == x){
                return i;
            }
        }
        return -1;
    }
    static int recFindEle(int nums[], int x, int i){
        if(i == nums.length){
            return -1;
        }
        if(nums[i] == x){
            return i;
        }
        return recFindEle(nums, x, i-1);
    }
    static int findSum(int nums[], int i, int sum){
        if(i < 0){
            return sum;
        }
        return findSum(nums, i-1, sum+nums[i]);
    }
    static void coinChange(int n, String ans){
        if(n == 0){
            System.out.println(ans);
            return;
        }
        coinChange(n-1, ans +="H");
        coinChange(n-1, ans +="T");
    }
    public static void main(String[] args) { 
        int nums[] = {2, 4, 6};
        int n = nums.length;
        // System.out.println(recFindEle(nums, 3, n-1));
        // System.out.println(findSum(nums, n-1, 0));
        coinChange(3, "");
    }
}



// 0 1 1 2 3 5 8



/*
 * Principal Of Mathematics Induction
 */ 