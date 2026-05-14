
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInArray {
    /**
     * https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
     */
    public static void main(String[] args) {
//        int[] arr = {4,3,2,7,8,2,3,1};
        int[] arr = {5,4,6,7,9,3,10,9,5,6};
//        int[] arr = {1,1,2};
        System.out.println(findDuplicates2(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int i=0;
        while (i< arr.length){
            if(arr[i] != i+1){
                int correctIndex = arr[i]-1;
                if(arr[i] != arr[correctIndex]){
                    int temp = arr[i];
                    arr[i] = arr[correctIndex];
                    arr[correctIndex] = temp;
                }
                else{
                    list.add(arr[i]);
                    i++;
                }
            }
            else
                i++;
        }
        return list;
    }

    public static List<Integer> findDuplicates2(int[] arr){
                int i=0;
                while (i< arr.length){
                    int correctIndex = arr[i]-1;
                    if(arr[i] == arr[correctIndex]){
                        i++;
                    }
                    else {
                        int temp = arr[i];
                        arr[i] = arr[correctIndex];
                        arr[correctIndex] = temp;
                    }
                }
                System.out.println(Arrays.toString(arr));

                List<Integer> list = new ArrayList<>();
                for (i=0;i< arr.length; i++){
                    if(arr[i] != i+1){
                        list.add(arr[i]);
                    }
                }
                return list;
    }
}
