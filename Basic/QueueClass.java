package Basic;
import java.util.*;
public class QueueClass {
    // private int arr[];
    // private int start, end, currSize, maxSize;

    // public QueueClass(){
    //     arr = new int[5];
    //     start = -1;
    //     end = -1;
    //     currSize = 0;
    // }
    // public QueueClass(int maxSize){
    //     this.maxSize = maxSize;
    //     arr = new int[maxSize];
    //     start = -1;
    //     end = -1;
    //     currSize = 0;
    // }
    // public void push(int newElement){
    //     if(currSize == maxSize){
    //         System.out.println("Queue is full\n");
    //         System.exit(0);
    //     }
    //     if(end == -1){
    //         start = 0;
    //         end = 0;
    //     }else{
    //         end = (end+1)%maxSize;
    //         arr[end] = newElement;
    //         currSize++;
    //     }
    // }
    // public int pop(){
    //     if(start == -1){
    //         System.out.println("Queue is empty\n");
    //         System.exit(1);
    //     }
    //     int popped = arr[start];
    //     if(currSize == 1){
    //         start = -1;
    //         end = -1;
    //     }
    //     else{
    //         start = (start+1)%maxSize;
    //     }
    //     currSize--;
    //     return popped;
    // }
    // public int top(){
    //     if (start == -1) {
    //         System.out.println("Queue Empty\n");
    //         System.exit(1);
    //     }
    //     return arr[start];
    // }
    // public int size(){
    //     return currSize;
    // }
    // public boolean isEmpty(){
    //     return start == -1;
    // }



    public static int[] rightAns(int nums[], int n){
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = nums.length-1; i >= 0; i--){
            
            while(!s.isEmpty() && s.peek() < nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }
            else ans[i] = s.peek();
            s.push(nums[i]);
        }
        return ans;
    }
    static int[] leftAns(int nums[], int n){
        int ans[] = new int[n];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < n; i++){
            
            while(!s.isEmpty() && s.peek() < nums[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[i] = -1;
            }
            else ans[i] = s.peek();
            s.push(nums[i]);
        }
        return ans;
    }
   

    public static void main(String[] args) {
        int nums[] = {8, 2, 7, 3, 4, 6, 9};
        int n = nums.length;
        int right[] = rightAns(nums, n);
        int left[] = leftAns(nums, n);
        for(int i = 0; i < n; i++){
            System.out.print(left[i]+" ");
        }
    }
   
}
