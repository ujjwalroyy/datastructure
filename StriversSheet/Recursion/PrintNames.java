package StriversSheet.Recursion;

public class PrintNames {
    static void printName(int n){
        if(n != 0){
            System.out.println("Mr. Developer");
            printName(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 4;
        printName(n);
    }
}
