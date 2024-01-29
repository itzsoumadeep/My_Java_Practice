public class mountainArray {
    public static void main(String[] args) {
        int[]arr = {0,1,0};
        System.out.println(peakIndexInMountainArrayBS(arr));
    }
    public static int peakIndexInMountainArrayBS(int[] arr) {
        int start=0;
        int right=arr.length-1;
        while(start<=right)
        {
            int mid=start+(right-start)/2;

            if(arr[mid]<arr[mid+1])
            {
                start=mid+1;
            }
            else
                right=mid-1;
        }
        return start;
    }

    }

