public class RotatedSortedArray {
    /**
     * In rotated sorted array, eventhough array is sorted, arr[0] will not be lesserthan arr[length-1]
     * Normal sortedArray = [2, 4, 6, 8, 10], rotatedSortedArray = [8, 10, 2, 4, 6]
     *
     * In order to search given element in rotated sorted.
     * 1. Find pivot which is index of larget number is an array.
     *      if pivot is -1, given array is not a rotatedSortedArray. So do normal binary search.
     * 2. check whether target == arr[pivot]
     * 3. check target > arr[0]
     *      if yes, do normal binary search in between arr[0] and arr[pivot-1]
     *  else
     *      do normal binary search in between arr[pivot+1] and arr[length-1]
     */
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 8, 9, 10, 1, 2};
        int[] arr2 = {9, 10, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr3 = {1};
//        System.out.println(searchInRotatedSortedArray(arr, 1));
//        System.out.println(searchInRotatedSortedArray(arr2, 1));
        System.out.println(searchInRotatedSortedArray(arr3, 1));
    }

    public static int searchInRotatedSortedArray(int[] arr, int target){
        int pivot = findPivot(arr);
        System.out.println("pivot is "+pivot);
        if(pivot == -1)
            return binarySearch(arr, 0, arr.length-1, target);
        if(target == arr[pivot])
            return pivot;
        if(target > arr[0])
            return binarySearch(arr, 0, pivot-1, target);
        else
            return binarySearch(arr, pivot+1, arr.length-1, target);
    }


    public static int findPivot(int[] arr){
        /**
         * To find pivot,
         * 1. compare mid > mid+1. this means mid is pivot
         * 2. compare mid-1 > mid. this means mid-1 is the pivot
         * 3. compare mid <= arr[start], this means pivot is in between arr[start] and arr[mid]. So end = mid-1.
         * 4. otherwise start = mid + 1
         * 5. and mid = start + (end-start)/2
         * 6. repeat from step 1 until start <= end.
         *
         * if loop breaks return -1
         *
         * 3, 4, 5, 6, 7, 8, 9, 10, 1, 2
         * 9, 10, 1, 2, 3, 4, 5, 6, 7, 8
         */
        int start = 0;
        int end = arr.length-1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start) /2 ;
            if(mid < end && arr[mid] > arr[mid+1])
                return mid;
            if(mid > start && arr[mid-1] > arr[mid])
                return mid-1;
            if(arr[start] >= arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int start, int end, int target){
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if(arr[mid] == target)
                return mid;
            if(arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }

}
