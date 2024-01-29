import java.util.ArrayList;
import java.util.List;

public class frstMissingPositive {
    public static void main(String[] args) {
        int[] arr={3,4,-1,1};
        int ans=missingPosnum(arr);
        System.out.println(ans);
    }
    public static int missingPosnum(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i]-1;
            if (nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            
            if (nums[index] != index+1) {
                return index+1;
            }
        }
        return nums.length+1;
    }


    static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }
}