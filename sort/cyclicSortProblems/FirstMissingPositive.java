package DSA_KunalKushwa.v20;

public class FirstMissingPositive {
    /**
     * https://leetcode.com/problems/first-missing-positive/description/
     *
     * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
     * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
     *
     * Example 1:
     * Input: nums = [1,2,0]
     * Output: 3
     * Explanation: The numbers in the range [1,2] are all in the array.
     *
     * Example 2:
     * Input: nums = [3,4,-1,1]
     * Output: 2
     * Explanation: 1 is in the array but 2 is missing.
     *
     * Example 3:
     * Input: nums = [7,8,9,11,12]
     * Output: 1
     * Explanation: The smallest positive integer 1 is missing.
     */
    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[] {1,2,0}));
        System.out.println(firstMissingPositive(new int[] {3,4,-1,1}));
        System.out.println(firstMissingPositive(new int[] {7,8,9,11,12}));
        System.out.println(firstMissingPositive(new int[] {1}));
    }

    public static int firstMissingPositive(int[] nums){
        int[] arr = nums.clone();
        int i=0;
        while (i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]>0 && arr[i]< arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }else
                i++;
        }

        for (i=0; i< arr.length; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }

        return -1;
    }

    private static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i];
        arr[i] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
