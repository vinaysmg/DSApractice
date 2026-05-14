package DSA_KunalKushwa.v20;

public class MissingNumberInArray {
    /**
     *  https://leetcode.com/problems/missing-number/
     *
     */
    public static void main(String[] args) {
        int[] nums = {0,1};
        System.out.println(missingNumber(nums));
    }
    public static int missingNumber(int[] nums) {
        sort(nums);
        int i=0;
        for(; i<nums.length; i++){
            if(nums[i] != i)
                return i;
        }
        return i;
    }

    public static void sort(int[] arr){
        int i =0;
        while(i< arr.length){
            int correctIndex = arr[i];
            if(arr[i] >= arr.length || arr[i] == arr[correctIndex])
                i++;
            else {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
    }
}
