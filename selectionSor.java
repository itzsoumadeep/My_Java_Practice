import java.util.Arrays;

public class selectionSor {
    public static void main(String[] args) {
        int [] arr={-9,-8,11,0,-5,2,5,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){
        for (int i = 0; i < arr.length ; i++) {
            //find the maximum item in remaining array and swap with the correct index
            int last=arr.length-i-1;
            int maxIndex= getMaxINdex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    private static int getMaxINdex(int[] arr, int start,int end) {
        int max=start;
        for (int i = start; i <=end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
    static void swap(int[]arr,int first,int last){
        int temp=arr[first];
        arr[first]=arr[last];
        arr[last]=temp;
    }
}
