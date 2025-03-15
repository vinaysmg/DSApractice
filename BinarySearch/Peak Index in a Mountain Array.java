 /***
     * Mountain array is like elements are sorted as increasing order reaches max value and elements are sorted as 
     * descreasing order.
     * Here objective is to find max element mountain array.
     */
    
    public static int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        int mid = 0;

        while (left < right){
            mid = left + (right - left) / 2;

            /**
             * comparision is made to find out whether elments are in increasing or descresing
             * If incresing, search array has to right side of middle elemnt, So left = mid + 1;
             * If decreasing, search array has to be left side of middle element including it. So right = mid;
             * When left == right, elment is found.
             */
            if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left; // or return right;
    }
