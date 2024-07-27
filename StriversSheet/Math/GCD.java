package StriversSheet.Math;

public class GCD {
    static int findGCD(int n1, int n2){
        int gcd = 1;
        for(int i = 1; i <= Math.min(n1, n2); i++){
            if(n1 % i == 0 && n2 % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    static int findGcdOpt(int n1, int n2){
        while(n1 > 0 && n2 > 0){
            if(n1 > n2){
                n1 = n1 % n2;
            }
            else {
                n2 = n2 % n1;
            }
        }
        if(n1 == 0){
            return n2;
        }
        return n1;
    }
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 15;
        System.out.println(findGCD(n1, n2));
        System.out.println(findGcdOpt(n1, n2));
    }
}
