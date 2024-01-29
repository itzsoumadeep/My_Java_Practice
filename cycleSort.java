import java.lang.reflect.Array;
import java.util.Arrays;

public class cycleSort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 4, 1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            while (arr[i] != (i + 1)) {
//                swap(arr, i, arr[i] - 1);
//            }
//        }
        int i = 0;
        while (i<arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }
}