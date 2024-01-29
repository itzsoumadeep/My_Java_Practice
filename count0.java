public class count0 {
    public static void main(String[] args) {
        System.out.println(countZero(2304503));
    }
    //Special example to return same value to above function
    static int countZero(int n){
        return getHelper(n,0);

    }

    private static int getHelper(int n,int c) {

        if (n==0){
            return c;
        }
        int rem=n%10;
        if (rem==0){
            return getHelper(n/10,++c);
        }
        return getHelper(n/10,c);
    }
}
