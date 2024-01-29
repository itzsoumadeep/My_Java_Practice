import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9};
        int target=8;
        int[] ans=twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i <=nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i]+nums[j]==target){
                    return new int[] {i,j};
                }
            }
        }
        return new int [] {};
    }

}
