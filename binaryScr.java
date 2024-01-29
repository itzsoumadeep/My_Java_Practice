import java.util.Scanner;

public class binaryScr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("target :");
        int target=sc.nextInt();
        int ans=binarySearch(arr,target);
        if (ans==-1){
            System.out.println("Element not present in array");
        }else {
            System.out.println("Elelment present at index: "+ans);
        }


    }
static int binarySearch(int[] arr,int target){
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
        return mid; // it is ans
        }
        }
        return -1;
        }
        }