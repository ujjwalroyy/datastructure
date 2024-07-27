package StriversSheet.Arrays.Easy;

public class FindMissingNumber {
    static int missingNum(int nums[], int n){
        for(int i = 1; i <= n; i++){
            boolean check = false;
            for(int j = 0; j < n; j++){
                if(nums[j] == i){
                    check = true;
                    break;
                }
            }
            if(check == false){
                return i;
            }
        }
        return -1;
    }
    static int missingNum2(int nums[], int n){
        int hash[] = new int[n+1];
        for(int i = 0; i < n-1; i++){
            hash[nums[i]]++;
        }
        for(int i = 1; i <= n; i++){
            if(hash[i] == 0){
                return i;
            }
        }
        return -1;
    }
    static int missingNumOpt(int nums[], int n){
        int totalSum = (n*(n+1))/2;
        int sum = 0;
        for(int i = 0; i < n-1; i++){
            sum += nums[i];
        }
        int missing = totalSum-sum;
        return missing;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 7, 8};
        int n = nums.length;
        System.out.println(missingNumOpt(nums, n));
    }
}
