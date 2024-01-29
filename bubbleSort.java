import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        int [] arr={1,5,32,8,2};
       bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static  void bubbleSort(int[] arr){
//
        //run the steps n-1 time
        for (int i = 0; i <arr.length ; i++) {
//
            //for every index ,max item will come at the last respective index
            for (int j = 1; j < arr.length-i ; j++) {
                //swap if the item are s
                // maller then previous item
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
//                    isSwapped=true;
                }


            }

        }
    }
}

