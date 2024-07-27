package StriversSheet.Math;

public class PalindromeNumber {
    static boolean isPalindrome(int n){
        int curr = n;
        int rev = 0;
        while(n > 0){
            int last = n % 10;
            rev = (rev * 10) + last;
            n = n / 10;
        }
        if(curr == rev){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 8778;
        System.out.println(isPalindrome(n));
    }
}
