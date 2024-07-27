package Basic;
import java.util.LinkedList;
public class Main {
    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }
    // static class LinkedList{
    //     Node head;
    //     Node tail;
    //     LinkedList(){
    //         this.head = null;
    //         this.tail = null;
    //     }
    //     void add(int data){
    //         Node curr = new Node(data);
    //         if(head == null){
    //             head = curr;
    //             tail = curr;
    //         }
    //         tail.next = curr;
    //         tail = curr;
    //     }
    //     Node remove(){
    //         Node curr = tail;
    //         while(curr.next.next == null){
    //             curr.next = null;
    //         }
    //         return curr.next;
    //     }
    //     int size(Node head){
            // int cnt = 0;
            // Node temp = head;
            // while(temp != null){
            //     cnt++;
            //     temp = temp.next;
            // }
            // return cnt;
    //     }
    //     void addLast(int data){
    //         Node newNode = new Node(data);
    //         Node curr = head;
    //         while(curr.next != null){
    //             curr = curr.next;
    //         }
    //         curr.next = newNode;
    //     }
    // }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Node head = new Node(6);
        head.next = new Node(2);
        head.next.next = new Node(4);
        int x = 3;
        Node curr = head;
        while(curr != null){
            if(curr.data == x){
                System.out.println("Found");
            }
            curr = curr.next;
        }
        System.out.println("End...");
    }
}
