import java.util.Arrays;
import java.util.Scanner;

public class oddevendigits {
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
        int [] nums=arr;

        System.out.println(findNum(nums));

    }
    static int findNum(int[] nums){
        int count=0;
        for (int num:nums){
            if (even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofDigits=digits(num);
//        if (numberofDigits % 2 ==0){
//            return true;
//        }
        return numberofDigits %2 == 0;
    }
    static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;

    }

}
