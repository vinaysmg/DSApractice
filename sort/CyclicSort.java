import java.util.Arrays;

/***
 *   This Algorithm can be used when problem statement is on  0 to n range array
 *   value in current index is checked whether is in right index, index = value for range [o,n]. index = value - 1 for range[1,n]
 *   if yes, check will happen for next index
 *   if not, value is swapped with correct index value. after swapping again new value in current index is checked whether is in right index
 *
 */
public class CyclicSort {
    public static void main(String[] args) {
        // value = index + 1
        int[] arr = {3, 5, 2, 1, 4};
        System.out.println(Arrays.toString(cyclicSort(arr)));
        System.out.println(Arrays.toString(cyclicSort2(arr)));
    }

    public static int[] cyclicSort(int[] array){
        int[] arr = array.clone();
        for (int i = 0; i < arr.length; i++) {
            while (!(arr[i] == i + 1)){
                int temp = arr[i];
                arr[i] = arr[temp-1];    //    1, 5, 2, 1, 4
                arr[temp-1] = temp;
            }
        }
        return arr;
    }

    public static int[] cyclicSort2(int[] array){
        int[] arr = array.clone();
        int i = 0;
        while (i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex ] = temp;
            } else
                i++;
        }
        return arr;
    }

}
