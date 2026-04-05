package DSA_KunalKushwa.v18;

import java.util.Arrays;

public class InsertionSort {
    /***
     * In insertion sort, 2 for loops used, outer loop starts from index i=0, inner loop starts from last index small chunk taken j= i+1.
     * small chunk is sorted. then in next iteration of outer loop, one more element is added to chunk.
     * Suppose array 3, 1, 5, 4, 2
     * outer loop exit condition = i<= n-2
     * inner loop exit condition = j>0, because j decrements on each iteration
     * at 1st iteration
     *              i=0, j=1, chunk = {3, 1}
     *              first 2 elements are sorted, after sort array -> 1, 3, 5, 4, 2
     * In 2nd iteration
     *              i=1, j=2, chunk = {1, 3, 5}
     *              first 3 elements are sorted, after sort array -> 1, 3, 5, 4, 2
     * In 3rd itr
     *              i=2, j=3, chunk = {1, 3, 5, 4}
     *              first 4 elements arr-> 1, 3, 4, 5, 2
     * In 4th itr first 5 elements arr-> 1, 2, 3, 4, 5
     *
     */

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr){
        for(int i=0; i<= arr.length-2; i++){
            for(int j=i+1; j>0; j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else
                    break;
            }
        }
    }

}
