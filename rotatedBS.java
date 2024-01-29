public class rotatedBS {
    public static void main(String[] args) {
      int[] arr = {2,9,2,2,2};
        System.out.println(fndPivot(arr));
        int ans=search(arr,9);
        System.out.println(ans);

    }
    static int search(int[] nums,int target){
        int pivot= fndPivot(nums);
        if(pivot==-1){
           return binarySearch(nums,target,0,nums.length-1);
        }
        if (nums[pivot]==target){
            return pivot;
        }
        if (target>=nums[0]){
            return binarySearch(nums,target,0,pivot-1);
        }else {
            return binarySearch(nums, target, pivot + 1, nums.length - 1);
        }
    }
    static int fndPivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end) {
            int mid = start +end / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
            //if elements at middle,start,end are equal then just skip the duplicates
//            if (arr[mid]==arr[start] && arr[mid]==arr[end]){
//                //skip the duplicates
//                //what about when these element at start and end where the pivot?
//                //check if the start is pivot
//                if (arr[start]>arr[start+1]) {
//                    return start;
//                }
//                start++;
//                //check the end if are pivot
//                if (arr[end]<arr[end-1]){
//                    return end-1;
//                }
//                end--;
//            }
//        //left side is sorted so pivot should be in right
//        else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
//            start=mid+1;
//            }else {
//            end=mid-1;
//            }
        }
        return -1;
    }
    static int binarySearch(int[] arr,int target,int start, int end){
        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2 ==> but it mite be possible that it exceed the range of integer in java .so we can do
            int mid=start+((end -start)/2);
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else {
                return mid; // it is ans
            }
        }
        return -1;
    }

}
