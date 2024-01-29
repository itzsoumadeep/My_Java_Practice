public class RevNum {
    public static void main(String[] args) {
//        revNum(1253);
        System.out.println(rev1(1234));
    }
   static int rev1(int n){
        int digits=(int) (Math.log10(n))+1;
        return getHelper(n, digits);
   }

    private static int getHelper(int n, int digits) {
        if (n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int) (Math.pow(10,digits-1))+getHelper(n/10,digits-1);
    }

}
