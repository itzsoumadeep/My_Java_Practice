public class infiniteArray {
    public static void main(String[] args) {
        int[] arr={3,5,7,9,10,90,100,130,140,160,170};
        int target=9;
        System.out.println(ans(arr,target));

    }
    static int ans(int[] arr,int target){
        //initially in array the start and end index are 0 & 1..
        int start=0;
        int end=1;
        //condition the target to lie in the range
        while (target>arr[end]){
            int temp=end+1;//this is my new start
            //double the box value
            //rules -> previous end=size of box * 2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[] arr,int target,int start,int end){
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

