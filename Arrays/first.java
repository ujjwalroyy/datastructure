public class first {
    public static boolean searchItem(String[] b, String item){
        for(int i = 0; i < b.length; i++){
            if(b[i] == item){
                return true;
            }
        }
        return false;
    }
    public static int searchRoll(int rollNumber[], int roll){
        for(int i = 0; i < rollNumber.length; i++){
            if(rollNumber[i] == roll){
                return i;
            }
        }
        return -1;
    }
    public static int smallestNum(int arr[]){
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[res] > arr[i]){
                res = i;
            }
        }
        return res;
    }
    public static int largestNum(int arr[]){
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[res] < arr[i]){
                res = i;
            }
        }
        return arr[res];
    }
    public static int findSum(int arr[]){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;
    }
    public static int sumRange(int arr[], int s, int e){
        int sum = 0;
        for(int i = s; i <= e; i++){
            sum += arr[i];
        }
        return sum;
    }
    //findSmallestInRange
    //findLargestInRange



    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 4, 3, 4, 2, 3};
        int i = 0;
        // j-i+1
        int j = 2;
        int sum = 0;
        while(j < arr.length){
            int tempSum = sumRange(arr, i, j);
            sum = Math.max(sum, tempSum);
            i++;j++;
        }
        System.out.println(sum);
        // System.out.println(rollNumber);
        // String []box = {"box", "pencil", "eraser"};
        // System.out.println(searchItem(box, "eraser"));
        // System.out.println(sumRange(rollNumber, 1, 3));
    }
}