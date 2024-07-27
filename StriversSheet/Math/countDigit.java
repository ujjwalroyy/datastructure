package StriversSheet.Math;

public class countDigit {
    static int solution(int n){
        int cnt = 0;
        while(n > 0){
            cnt = cnt + 1;
            n = n / 10;
        }
        return cnt;
    }
    static int solutionOpt(int n){
        int cnt = (int)(Math.log10(n)+1);
        return cnt;
    }
    public static void main(String[] args) {
        int n = 329823;
        countDigit cd = new countDigit();
        int ans = cd.solutionOpt(n);
        System.out.println(ans);
    }
}