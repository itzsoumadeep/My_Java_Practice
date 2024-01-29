import jdk.jshell.spi.SPIResolutionException;

import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        System.out.println("Enter the element of array");
        Scanner sc=new Scanner(System.in);
        int[] arr= new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
//        System.out.println("The maximum item of the array is: "+ max(arr));
       
         rev(arr);

        
//        swap(arr,arr[0],arr[3]);
////        System.out.println(Arrays.toString(arr));
    }
//    static  void swap(int[] arr, int index1, int index2){
//        int temp= arr[index1];
//        arr[index1]=arr[index2];
//        arr[index2]=temp;
    //Find maximum item of the array
//    static int max(int[] arr){
//        int maxVal=arr[0];
//        for (int i=1;i< arr.length;i++){
//            if (arr[i]>maxVal){
//                maxVal=arr[i];
//            }
//        }
//        return maxVal;
//    }

    static void rev(int[] arr){
        int start=arr[0];
        int end=arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }

    static  void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
