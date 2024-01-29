public class searchInMountain {
    public static void main(String[] args) {
        int[] arr={1,3,4,6,5,2,0};
        int target=2;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target){
        int peak=peakIndexInMountainArrayBS(arr);
        int firstTry=orderahnosticbinarySearch(arr,target,0,peak);
        if (firstTry!=-1){
            return firstTry;
        }
        //try the second half
        return orderahnosticbinarySearch(arr,target,peak+1,arr.length-1);
    }

    public static int peakIndexInMountainArrayBS(int[] arr) {
        int start = 0;
        int right = arr.length - 1;
        while (start <= right) {
            int mid = start + (right - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else
                right = mid - 1;
        }
        return start;
    }
    static int orderahnosticbinarySearch(int[] arr,int target,int start,int end){

        //find that the array is ascending or descending
        boolean isAsc= arr[start]<arr[end];

        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2 ==> but it mite be possible that it exceed the range of integer in java .so we can do
            int mid=start+((end -start)/2);
            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                } else if (target<arr[mid]) {
                    end = mid - 1;
                }
            }else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
