package Basic;
public class HomeWork1 {
    static void Pattern1(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern2(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++)
                System.out.print("  ");
            for(int j = 1; j <= i; j++)
                System.out.print("* ");
            
            System.out.println();
        }
    }
    static void Pattern5(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern6(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern7(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == 1 || j == 1 || i == n || j == n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void Pattern8(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j || n-i+1 == j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void Pattern9(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < 2*(i-1); j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Pattern10(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < 2*(i-1); j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= n; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Pattern11(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < 2*(i-1); j++){
                if(j % 2 == 1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Pattern12(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < 2*(i); j++){
                if(j % 2 == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("! ");
                }
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Pattern13(int n){
        for(int i = 1; i <= 2*n-1; i++){
            int star = i;
            if(star > n){
                star = 2*n-i;
            }
            for(int j = 1; j <= star; j++){
                System.out.print("* "); 
            }

            System.out.println();
        }
    }
    static void Pattern14(int n){
        for(int i = 1; i <= 2*n-1 ; i++){
            int star = i;
            if(star > n){
                star = 2*n-i;
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i-n; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("* "); 
            }
            System.out.println();
        }
    }
    static void Pattern15(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern16(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 2; i <= n; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    static void Pattern17(int n){
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
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
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern18(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n-1; i >= 1; i--){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 2; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern20(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(n-i+1 == j){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void Pattern21(int n){ 
        for(int i = 1; i <= n; i++){
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
    static void Pattern22(int n){
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
    static void Pattern23(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < 2*(i-1); j++){
                System.out.print("1 ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Pattern24(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < 2*(i-1); j++){
                System.out.print(i+" ");
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void Pattern25(int n){
        int c = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j < 2*(i-1); j++){
                System.out.print(c +" ");
                c++;
            }
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern25(5);
    }
}
