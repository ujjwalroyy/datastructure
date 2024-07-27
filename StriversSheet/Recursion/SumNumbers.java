package StriversSheet.Recursion;

public class SumNumbers {
    static void sumNum(int n, int sum){
        if(n < 1){
            System.out.println(sum);
            return;
        }
        sumNum(n-1, sum+n);
        
    }
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        sumNum(n, sum);
    }
}
