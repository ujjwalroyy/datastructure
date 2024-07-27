import java.util.Arrays;

public class Sorting {
    static void bubbleSort(int nums[], int n){
        for(int i = n-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(nums[j] > nums[j+1]){
                    swap(nums, j, j+1);
                }
            }
        }
    }
    static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    static void selectionSort(int nums[], int n){
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
                swap(nums, min, j);
            }
        }
    }
    static void printArr(int nums[], int n){
        for(int i = 0; i < n; i++){
            System.out.print(nums[i]+" ");
        }
    }
    static void insertionSort(int nums[]){
        int n = nums.length;
        for(int i = 1; i < n; i++){
            int key = nums[i];
            int j = i-1;
            while(j >= 0 && nums[i] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }
    }
    static int find(int nums[], int n){
        Arrays.sort(nums);
        return nums[n-2];
    }
    public static void main(String[] args) {
        int nums[] = {14, 6, 8, 9, 3, 5};
        int n = nums.length;
        System.out.println(find(nums, n));
    }
}
