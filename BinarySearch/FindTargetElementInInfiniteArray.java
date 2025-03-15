public class FIndTargetElementInInfiniteArray {
    /**
     * Since array is infinite we cannot use .length keyword.
     * So To find target element, divide given array into small chunks and apply binarySearch.
     */
    public static int findIndexoftargetElement(int[] array, int start, int end, int target){
        int ans = -1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if(target == array[mid])
                return mid;
            else if(target > array[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
        }
        return ans;
    }

  // creating chunk of array from infinite array
    public static int findIndexOfTargetOfElementInfiniteArray(int[] array, int target){
        int ans = -1;
        int start = 0;
        int end = 1;
        while (target > array[end]){
            int temp = end + 1;
            end = end + 2*(end - start + 1);
            start = temp;
        }
        return findIndexoftargetElement(array, start, end, target);
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 9, 11, 14, 17, 19, 21, 25, 29, 33, 38, 39, 44, 46, 48, 49};
        System.out.println(findIndexOfTargetOfElementInfiniteArray(arr, 3));
    }
}
