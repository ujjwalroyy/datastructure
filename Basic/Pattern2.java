package Basic;


public class Pattern2 {
    public static void main(String args[]){
        int n = 5;
        pattern19(n);
    }
    static void pattern11(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
                if(j < i){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
                if(j < i){
                    System.out.print("! ");
                }
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2* (i-1); j++){
                System.out.print("  ");
            }
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= 2* (i-1); j++){
                System.out.print("  ");
            }
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }


        // for(int i = 0; i <= n; i++){
        //     for(int j = 1; j <= 2*i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 2*i; j <= n+i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for(int i = n; i >= 0; i--){
        //     for(int j = 1; j <= 2*i; j++){
        //         System.out.print("  ");
        //     }
        //     for(int j = 2*i; j <= n+i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
    }
    static void pattern16(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){
            for(int j = 1; j < i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern17(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = n; j > i; j--){
                System.out.print("    ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = n-i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void pattern18(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = n-i+1; j <= n; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = n-i+1; j <= n; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                if(j < n){
                    System.out.print("* ");
                }
            }
            int size = 2*(n-i);
            for(int j = 1; j <= size-1; j++){
                System.out.print("  ");
            }
            for(int j = n-i+1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    static void pattern20(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

}