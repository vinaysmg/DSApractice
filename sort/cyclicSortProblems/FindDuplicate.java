package DSA_KunalKushwa.v20;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-duplicate-number/
 * Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 *
 * There is only one repeated number in nums, return this repeated number.
 *
 * You must solve the problem without modifying the array nums and using only constant extra space. *
 * Example 1: *
 * Input: nums = [1,3,4,2,2]
 * Output: 2
 *
 * Example 2: *
 * Input: nums = [3,1,3,4,2]
 * Output: 3
 *
 * Example 3: *
 * Input: nums = [3,3,3,3,3]
 * Output: 3
 */
class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,4,1,3};
//        System.out.println(Arrays.toString(arr));
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int correctIndex = arr[i]-1;
                if(arr[i] != arr[correctIndex]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }
                else
                    return arr[i];
            }
            else
                i++;
        }
        return -1;
    }

}
