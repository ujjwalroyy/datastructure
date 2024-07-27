import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class AList {
    // static ArrayList<Integer> isPalindrome(String s1){
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int i = 0;
    //     int j = s1.length()-1;
    //     while(i < j){
    //         if(s1.charAt(i) == s1.charAt(j)){
    //             list.add(i);
    //         }
    //         i++;
    //         j--;
    //     }
    //     return list;
    // }

    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();
        // list.add(3);
        // list.add(14);
        // list.add(7);
        // list.add(20);
        // list.add(3, 40);
        // System.out.println(list);
        // System.out.println(list.get(2));
        // list.remove(3);
        // list.set(2, 16);
        // list.set(2, list.get(2)+10);
        // System.out.println(list);
        // Collections.sort(list);
        // System.out.println(list);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println("Sort : "+list);

        int sum = 0;
        for(int it : list){
            sum += it;
        }

        System.out.println("Sum : "+sum);
        System.out.println(list.get(0));
        System.out.println(list.get(n-1));
        // int smallest = Integer.MAX_VALUE;
        // int largest = Integer.MIN_VALUE ;
        // for(int it : list){
        //     smallest = Math.min(smallest, it);
        //     largest = Math.max(largest, it);
        // }

        // System.out.println("Smallest "+smallest);
        // System.out.println("Largest "+largest);

        int size = list.size();
        System.out.println("Average : "+ (double)sum/size);
        ArrayList<String> sl = new ArrayList<>();
        System.out.println("Enter Sentence: ");
        String str = sc.nextLine().trim();
        String arr[] = str.split("\str+");
        // str = new ArrayList<String>(Arrays.asList(arr));
        sl.add(str);

    }
}