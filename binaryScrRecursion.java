public class binaryScrRecursion {
    public static void main(String[] args) {
        int[] arr={1,6,9,15,66,98};
        int target=15;
        int ans=search(arr,target,0,arr.length-1);
        System.out.println(ans);

    }
    static  int search(int[] arr,int target,int start,int end){
        if (start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if (arr[mid]==target){
            return mid;
        }
        if (arr[mid]<target){
            return  search(arr,target,mid+1,end);
        }
        return search(arr,target,start,mid-1);
    }
}
