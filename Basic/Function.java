package Basic;
public class Function {
    public static void main(String[] args) {
        // System.out.println(product(2, 4));
        // int ans = sum(3, 7);
        // System.out.println(ans);
        // print();
        System.out.println(natural(6));
    }
    public static int product(int a, int b){
        int p = a*b;
        return p;
    }
    public static int sum(int a, int b){
        int s = a + b;
        return s;
    }
    public static void print(){
        for(int i = 1; i <= 5; i++){
            System.out.print("* ");
        }
    }
    public static void printPat(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i-1; j++){
                System.out.print("  ");
            }
            for(int j = i; j <= n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static int natural(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        return sum;
    }
}
