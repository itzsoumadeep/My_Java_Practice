import java.util.Arrays;

public class findFirstandLast {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int start= search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    static int search(int[] nums,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            //find the middle element
            //int mid=(start+end)/2 ==> but it mite be possible that it exceed the range of integer in java .so we can do
            int mid = start + ((end - start) / 2);
            if (target > nums[mid]) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans= mid; // it is ans
                if (findStartIndex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}



