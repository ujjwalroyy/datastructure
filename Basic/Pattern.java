package Basic;

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int row = sc.nextInt();
        // int col = sc.nextInt();
        int n = 8;
        // pattern1(n);
        // System.out.println();
        // pattern2(n);
        // System.out.println();
        // pattern3(n);
        // System.out.println();
        // pattern4(n);
        // System.out.println();
        // pattern5(n);
        // System.out.println();
        pattern6(n);
        // System.out.println();
        // pattern7(n);
        // System.out.println();
        // pattern8(n);
        // System.out.println();
        // pattern9(n);
        // System.out.println();
        // pattern10(n);
        // System.out.println();
        // pattern11(n);
        // System.out.println();
        // pattern12(n);
    }
    public static void pattern1(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int i = n; i > 0; i--){
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("  ");
            }
            for(int j = n-i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for(int i = n; i > 0; i--){
            for(int j = n; j > i; j--){
                System.out.print("  ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern6(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*i; j++){
                System.out.print("  ");
            }
            for(int j = 2*i; j < n+i; j++){
                System.out.print("* ");
            }
           
            System.out.println();
        }
    }
    
    public static void pattern7(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n-1 || j == n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for(int i = 0; i < n; i++){
            for(int j = n; j >= 0; j--){
                if(i == j ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        int low = 0;
        int high = n-1;
        String mat[][] = new String[n][n];
        while(low <= high){
            mat[low][high] = "* ";
            low++;
            high--;
        }
        System.out.println();
    }
    public static void pattern10(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n-i; j++){
                System.out.print("  ");
            }
            for(int j = n-i; j < n; j++){
                System.out.print("* ");
            }
            for(int j = 0; j < i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for(int i = n; i >= 1; i--){
            for(int j = n; j > i; j--){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
