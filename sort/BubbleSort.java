package DSA_KunalKushwa.v17;

import java.util.Arrays;

public class BubbleSort {

    /**
     * Bubble sort is also called as sinking sort, Exchange sort.
     * approach is to compare adjacent elements, swap if they are not in order.
     *
     * arr = {3, 1, 5, 4, 2}
     *      1st pase
     *          1st iteration :is arr[0] > arr[1], true, swap them.
     *          array becomes, arr[1, 3, 5, 4, 2]
     *          2nd iteration :is arr[1] > arr[2], false, no action
     *          3rd iteration: is arr[2] > arr[3], true, swap them
     *          array becomes, arr[1, 3, 4, 5, 2]
     *          4th iteration: is arr[3] > arr[4], true, swap them
     *          array becomes, arr[1, 3, 4, 2, 5], now array is not sorted yet. We need to do above steps again.
     *
     *      2nd phase arr[1, 3, 4, 2, 5]
     *          1st iteration: is arr[0] > arr[1], false, no action
     *          2nd iteration: is arr[1] > arr[2}, false no action
     *          3rd iteration: is arr[2] > arr[3], true, swap them, array becomes arr[1, 3, 2, 4, 5]
     *
     *          Now we don't need to compare arr[3] with arr[4], because in last iteration largest of array
     *          is placed in arr[4]
                Each time we traverse through array, largest elements are locating in last positions.

            3rd phase arr[1, 3, 2, 4, 5]
                1st iteration: is arr[0] > arr[1], false
                2nd iteration: is arr[1] > arr[2], true, swap them. array becomes arr[1, 2, 3, 4, 5]
                As saied earlier, now we don't need to compare arr[2] with arr[3]

            4th phase arr[1, 2, 3, 4, 5]
                1st iteration: is arr[0] > arr[1], false

     Observation: we need to make use of 2 loops, outer loop i starts from 0 and ends at arr.length
        inner loop starts from 1 and ends at arr.length-i, Since we can ignore largest placed in last position
        while comparing if there are no swap made, then we can consider array is sorted

     So array is sorted now, arr[1, 2, 3, 4, 5]
     *
     */

    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sortAscending(int[] arr){
        boolean isSwapped;

        /*
        Outer loop is kept to have counter, which will be used in inner loop for exiting the loop.
         */
        for (int i = 0; i < arr.length; i++) {
            isSwapped = false;

            /*
            inner loop starts from 1 and ends at arr.length-i, Since we can ignore largest placed in last position
             */
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1] > arr[j]){ // comparing adjacent element
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    isSwapped = true;
                }
            }

            if ( ! isSwapped ) // while comparing if there are no swap made, then we can consider array is sorted
                break;
        }
    }
}
