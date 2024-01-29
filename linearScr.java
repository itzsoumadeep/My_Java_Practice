import java.util.Arrays;
import java.util.Scanner;

public class linearScr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Size of array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Your entered array is: "+ Arrays.toString(arr));
//        System.out.print("Enter the target element: ");
//        int target=sc.nextInt();
        System.out.println("the minimum element of the array is :");
       int ans=min(arr);
        System.out.println(ans);



//        int ans= linerarScarch(arr,target);
//        System.out.println("Your target element's index is :"+ ans);



    }
    //search array: If item found then return that item otherwise return -1
//    static int linerarScarch(int[] arr, int target){
//        if (arr.length==0) {
//            return -1;
//        }
//            for (int index=0;index<arr.length;index++){
//                int element=arr[index];
//                if(element == target){
//                    return index;
//                }
//            }
//
//        return -1;
//    }

    //minimum number of an array
    static int min(int[] arr){
        int  ans =arr[0];
        for (int i = 1; i <arr.length; i++) {
            if (arr[i]<ans){
                ans=arr[i];
            }

        }
        return ans;

    }

}
