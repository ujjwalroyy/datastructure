package StriversSheet.Recursion;

public class PrintNumbers {
    static void printNum(int n, int i){
        if(i <= n){
            System.out.println(i);
            printNum(n, i+1);
        }
    }
    public static void main(String[] args) {
        int n = 8;
        printNum(n, 1);
    }
}
