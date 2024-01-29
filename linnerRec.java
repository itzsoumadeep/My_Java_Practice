import java.util.ArrayList;

public class linnerRec {
    public static void main(String[] args) {
        int[] arr={5,8,9,2,4,4,12};
        System.out.println(find(arr,8,0));
        System.out.println(findIndex(arr,9,0));
        System.out.println(findAllIndex(arr,4,0,new ArrayList<>()));
    }
    static boolean find(int[] arr,int target,int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr,target,index+1);
    }
    //if you want index of the  value then

    static int findIndex(int[] arr,int target,int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
            return findIndex(arr,target,index+1);
        }
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int index,ArrayList<Integer> list){
        if (index==arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
       return findAllIndex(arr,target,index+1, list);
    }

    static  ArrayList<Integer> findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if (index == arr.length){
            return list;
        }
        if (arr[index] == target){
            list.add(index);
        }
        ArrayList<Integer>AnsFromBellowCalls=findAllIndex2(arr,target,index+1);
        list.addAll(AnsFromBellowCalls);
        return list;
    }
}
