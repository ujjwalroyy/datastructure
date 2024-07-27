package StriversSheet.Math;

public class CheckPrime {
    static boolean isPrime(int n){
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                cnt = cnt + 1;
            }
        }
        if(cnt == 2){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 1483;
        System.out.println(isPrime(n));
    }
}
