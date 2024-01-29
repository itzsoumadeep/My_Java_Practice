public class PString {
    public static void main(String[] args) {
        String str="jhvhj";
        System.out.println(palindrome(str));

    }
    public  static boolean palindrome(String str){
        str=str.toLowerCase();
//        for (int i = 0; i < str.length(); i++) {
//            char start=str.charAt(i);
//            char end=str.charAt(str.length()-1-i);
//            if (start!=end){
//                return false;
//            }
//
//
//        }
//        return true;
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if (str.charAt(start)!=str.charAt(end)) {
                return false;
            }
                start++;
                end--;
        }
        return true;
    }


}
