package StriversSheet.Recursion;

public class StringPalindrome {
    static boolean isPalin(String str, int i){
        if(i >= str.length()/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length()-i-1));
        return isPalin(str, i+1);
    }
    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalin(s, 0));
    }
}
