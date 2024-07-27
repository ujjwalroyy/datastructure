package StriversSheet.Math;

public class AllDivisor {
    static int print(int n){
        int ans = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                ans++;
            }
        }
        return ans;
    }
    static int printDivOpt(int n){
        int ans = 0;
        int sqrt = (int)(Math.sqrt(n));
        for(int i = 1; i <= sqrt; i++){
            if(n % i == 0){
                ans++;
                if(i != n/i){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 12;
        System.out.println(print(n));
        System.out.println(printDivOpt(n));
    }
}
