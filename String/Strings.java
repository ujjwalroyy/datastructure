// package String;

public class Strings {
    public static boolean isCheck(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    static int compare(String s1, String s2){
        if(s1 == s2){
            return 0;
        }
        int len = Math.min(s1.length(), s2.length());
        for(int i = 0; i < len; i++){
            if(s1.charAt(i) != s2.charAt(i) ){
                return s1.charAt(i) -s2.charAt(i);
            }
        }
        return (s1.length() - s2.length());
    }
    static boolean isPalindrome(String s1){
        int i = 0;
        int j = s1.length()-1;
        while(i < j){
            if(s1.charAt(i) != s1.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static void goodSubString(String str){
        int n = str.length();

        for(int i = 0; i < n; i++){
            String sub = "";
            for(int j = i+1; j < n+1; j++){
                sub = str.substring(i, j);
                System.out.println(sub);
            }
        }
    }
    // static void reverseWord(String str){
    //     int n = str.length();
    //     int start = 0;
    //     for(int i = 0; i < n; i++){
    //         if(str.charAt(i) == ' '){
    //             reverse(str, start, i-1);
    //             start = i+1;
    //         }
    //         reverse(str, 0, n-1);
    //     }
    // }
    public static void main(String[] args) {
       
        String s1 = "Is sky of blue color";
        // System.out.println(isPalindrome(s1));
        goodSubString(s1);
    }
}
