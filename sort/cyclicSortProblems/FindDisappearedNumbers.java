package DSA_KunalKushwa.v20;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDisappearedNumbers {
    /**
     * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
     */
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(findMissingNumber(arr)));
    }

    public static int[] findMissingNumber(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i< arr.length; i++){
            if(arr[i] != i+1){
                list.add(i+1);
            }
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void cyclicSort(int[] arr){
        int i=0;
        while (i< arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] == arr[correctIndex])
                i++;
            else {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
        }
    }
}
