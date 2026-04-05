package DSA_KunalKushwa.v17;

import java.util.Arrays;

public class SelectionSort {
    /**
     * In selection sort,
     *  elements are placed in its right position.
     *      1st max element if found, then values are swaped between current index and max index
     *   Eg:   arr = {3, 1, 5, 4, 2};
     *  max element index = 3, maxIndex = 4
     *         So element between 3 and 4 index are swapped. array becomes -> [3, 1, 2, 4, 5]
     *  In 2nd step, max element index is calculated within 0 to 3, because in 4th index max element is already present
     *     arr[3, 1, 2, 4, 5]
     *      max element index = 4, and maxIndex= 4. then array becomes -> [3, 1, 2, 4, 5]
     *
     *
     */
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int maxIndex = arr.length-i-1;
            int maxElementIndex = getMaxElement(arr, 0, maxIndex);
            swap(arr, maxElementIndex, maxIndex);
        }
    }

    private static void swap(int[] arr, int maxElementIndex, int maxIndex) {
        if(maxElementIndex == maxIndex)
            return;
        int temp = arr[maxElementIndex];
        arr[maxElementIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }

    private static int getMaxElement(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int j = start; j <= end; j++) {
            if(max < arr[j]){
                max = arr[j];
                maxIndex = j;
            }
        }
        return maxIndex;
    }
}
