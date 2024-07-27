package Basic;
import java.util.HashMap;
import java.util.Map;

public class HashTable {
    static void maxMin(int nums[]){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }
        int maxi = Integer.MIN_VALUE;
        int mini = Integer.MAX_VALUE;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){ 
            maxi = Math.max(maxi, entry.getValue());
            mini = Math.min(mini, entry.getValue());
        }
        // System.out.println();
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){ 
        //     if(entry.getValue() == maxi){
        //         System.out.println("Maximim Freq: "+ entry.getValue());
        //     }
        //     if(entry.getValue() == mini){
        //         System.out.println("Maximim Freq: "+ entry.getValue());
        //     }
        // }
        System.out.println("Maximim Freq: "+ maxi);
        System.out.println("Maximim Freq: "+ mini);
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 1, 3, 2, 2, 4, 4, 5, 5, 5, 2};
        maxMin(nums);
        


















        // String arr[] = {"Gaurav", "Arpan", "Pramod", "Ayush"};
       
        // // for(int i = 1; i < arr.length; i++){
        // //     mt.put(i, arr[i-1]);
        // // }
        // for(char i = 0; i < arr.length; i++){
        //     mt.put((char)(97-i), arr[i]);
        // }
        // for(Map.Entry<Character, String> entry : mt.entrySet()){
        //     System.out.println(entry.getKey()+"  "+entry.getValue());
        // }

        
        
    }
}
