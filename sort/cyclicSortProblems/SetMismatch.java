package DSA_KunalKushwa.v20;

import java.util.Arrays;

public class SetMismatch {
    /** https://leetcode.com/problems/set-mismatch/
     *
     * Example 1:
     * Input: nums = [1,2,2,4]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1]
     * Output: [1,2]
     */

    public static void main(String[] args) {
        int[]  nums = {1,2,2,4};
        System.out.println("Error Nums:"+ Arrays.toString(findErrorNums(nums)));
        System.out.println("Error Nums:"+ Arrays.toString(findErrorNums(new int[] {1, 1})));
        System.out.println("Error Nums:"+ Arrays.toString(findErrorNums(new int[] {2, 2})));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] arr = nums.clone();
        int i=0;
        while (i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        for (i=0; i< arr.length; i++){
            if(arr[i] != i + 1){
                return new int[] {arr[i], i+1};
            }
        }

        return new int[] {-1, -1};
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
