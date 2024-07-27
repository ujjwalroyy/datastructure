package StriversSheet.Math;

public class ArmstrongNumber {
    static boolean solution(int n){
        int cnt = String.valueOf(n).length();
        int sum = 0;
        int num = n;
        while(n > 0){
            int last = n % 10;
            sum += Math.pow(last, cnt);
            n = n / 10;
        }
        return sum == num ? true:false;
    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(solution(n));
    }
}
