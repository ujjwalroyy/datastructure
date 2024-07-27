package Basic;

import java.util.*;

public class HelloWorld {
    public static void main(String args[]){
        System.out.println("Hello World!");

        // int i = 10;
        // System.out.println(i);
        // boolean check = true;
        // System.out.println(check);
        // String s = "Ujjwal";
        // System.out.println(s);
        // float f = 2.5f;
        // System.out.println(f);
        // char ch = 'A';
        // System.out.println(ch);
        // double d = 2.42345;
        // System.out.println(d);
        // short st = 34;
        // System.out.println(st);
        // byte b = 4;
        // System.out.println(b);
        // char a = (char)(97);
        // char b = 20;
        // a--;
        // b++;
        // System.out.println(a);
        // System.out.println(b);
        // char ch = (char)(69 - 4);
        // System.out.println(ch);
        // int x = 3;
        // int y = 1;
        // System.out.println(x > y);
        // if (x > y) {
        //     System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }
        // int a = 10;
        // if(a > 1)
        //     System.out.println("A is greater");
        // else
        //     System.out.println("No");

        // int n = 10;
        // int a = 1;
        // for (int i = 1; i <= n; i++) {
        //     System.out.println("Ujjwal"+" --> "+ a++);
        // }

        // int n = 10;
        // int i = 1;
        // while (i <= n) {
        //     System.out.println("Ujjwal"+" --> "+ i++);
        // }

    //     int n = 10;
    //     int i = 1;
    //     do {
    //         System.out.println();
    //     } while (i <= n);


    Scanner sc = new Scanner(System.in);
    // int a;
    // String b;
    // String c;
    // a = sc.nextInt();
    // b = sc.next();
    // c = sc.nextLine();

    // System.out.println("value of a: "+ sc.nextInt());
    // System.out.println("value of b: "+sc.next());
    // sc.nextLine();
    // System.out.println("value of c: "+sc.nextLine());

    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int sum = a+b;
    System.out.println(sum);

    }
}
