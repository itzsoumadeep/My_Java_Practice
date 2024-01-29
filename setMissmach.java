import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class setMissmach {
    public static void main(String[] args) {
        int [] arr={1,2,2,4};
        findErrorNums(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if ( nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if (nums[index]!=index+1) {
               return new int[]{nums[index],index+1};
            }
        }
        return new int[]{-1,-1};
    }


    static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;

    }
}
