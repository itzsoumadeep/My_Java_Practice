import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class missingNumOfArray {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
       List<Integer> ans= missingArray(arr);
        System.out.println(ans);
    }
    static List<Integer> missingArray(int[] arr){
        int i = 0;
        while (i<arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for (int index = 0; index <arr.length ; index++) {
            if (index+1!=arr[index]){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }
}
