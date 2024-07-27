package StriversSheet.Recursion;

public class FibonacciNumber {
    static int solve(int n){
        if(n <= 1){
            return n;
        }
        return solve(n-1) + solve(n-2);
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(solve(n));
    }
}
