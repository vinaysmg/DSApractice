package BinarySearch.TutorialPractice;

public class CeilingFloorOfNumber {

    public static int getCielingOfGivenNumberInArray(int[] array, int target){
        if(target > array[array.length-1])
            return -1;

        int start = 0;
        int end = array.length-1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if(array[mid]== target)
                return array[mid];
            if(target > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return array[start];
    }

    public static int getFloorOfGivenNumberInArray(int[] array, int target){
        if(target < array[0])
            return -1;

        int start = 0;
        int end = array.length-1;
        int mid = 0;
        while (start <= end){
            mid = start + (end - start)/2;
            if(target == array[mid])
                return array[mid];
            if(target > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return array[end];
    }


    public static void main(String[] args){
        int[] arr = {2, 4, 5, 6, 7, 8, 9, 10 ,12};
        System.out.println(getCielingOfGivenNumberInArray(arr, 3));
        System.out.println(getFloorOfGivenNumberInArray(arr, 3));
        System.out.println(getCielingOfGivenNumberInArray(arr, 13));
        System.out.println(getCielingOfGivenNumberInArray(arr, 1));
    }
}
