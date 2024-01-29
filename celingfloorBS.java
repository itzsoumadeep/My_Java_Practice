public class celingfloorBS {
    public static void main(String[] args) {
        int[] arr={2,3,5,9,14,16,18};
        int target=15;
        int ans1=floorBS(arr,target);
        int ans2=ceilingBS(arr,target);
        System.out.println("The ceiling is "+ans1+" and the floor is "+ans2);

    }

    //find ceiling of a given number in an array
    static int ceilingBS(int[]arr,int target){
        //but what if the target element greater than the last element
        if (target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2 ==> but it mite be possible that it exceed the range of integer in java .so we can do
            int mid=start+((end -start)/2);
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return start;
    }
    //find floor of a given number in an array
    static int floorBS(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            //find the middle element
            //int mid=(start+end)/2 ==> but it mite be possible that it exceed the range of integer in java .so we can do
            int mid=start+((end -start)/2);
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return end;
    }
}

