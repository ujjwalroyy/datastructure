package Basic;
public class JavaBasic {
    public static void main(String args[]){
        // for(int i = 0; i < 5; i++){
        //     System.out.print("*");
        // }

        // for(int i = 1; i <= 5; i++){
        //     for(int j = 0; j < i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        System.out.println("start");
        for(int i = 5; i <= 1; i--){
            for(int j = 1; j <= i-1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
}