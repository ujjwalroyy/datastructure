package StriversSheet.Arrays.Midium;

public class LeadersInArr {
    static void printLeader(int nums[], int n){
        for(int i = 0; i < n; i++){
            boolean check = true;
            for(int j = i+1; j < n; j++){
                if(nums[j] > nums[i]){
                    check = false;
                    break;
                }
            }
            if(check){
                System.out.print(nums[i]+" ");
            }
        }
    }
    static void printLeaderOpt(int nums[], int n){
        int maxi = nums[n-1];
        System.out.print(maxi+" ");
        for(int i = n-2; i >= 0; i--){
            if(nums[i] > maxi){
                System.out.print(nums[i]+" ");
                maxi = nums[i];
            }
        }
    }
    public static void main(String[] args) {
        int nums[] = {10, 22, 12, 3, 0, 6};
        int n = nums.length;
        // printLeader(nums, n);
        printLeaderOpt(nums, n);

    }
}
