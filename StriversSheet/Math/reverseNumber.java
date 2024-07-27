package StriversSheet.Math;

public class reverseNumber {
    static int solution(int n){
        int revNum = 0;
        while(n > 0){
            int last = n % 10;
            revNum = (revNum * 10) + last;
            n = n/10;
        }
        return revNum;
    }
    public static void main(String[] args) {
        int n = 7789;
        System.out.println(solution(n));
    }
}
