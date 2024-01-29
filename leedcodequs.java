import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class leedcodequs {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        ArrayList<Integer>list=new ArrayList<>();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                list.add(nums1[i]);
                i++;
                j++;
            }
        }

        int[] ans=new int[list.size()];
        int k=0;
        while(k<list.size()){
            ans[k]=list.get(k);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st arrays size: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Enter 1st arrays element: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Your entered array is: " + Arrays.toString(arr1));

        System.out.println("Enter 2st arrays size: ");
        int size1 = sc.nextInt();
        int[] arr2 = new int[size1];
        System.out.println("Enter 2st arrays element: ");
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Your entered array is: " + Arrays.toString(arr2));
        int[] ans=intersect( arr1, arr2);

        System.out.println(ans);
    }

}
