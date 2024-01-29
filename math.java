public class math {
    public static void main(String[] args) {
        int n=40;
        int p=3;
//        for (int i = 1; i <=n ; i++) {
//            System.out.println(i+" "+ isprimeNum(i));
//        }
//        boolean[] primes=new boolean[n+1];
//        isprimenum1(n,primes);
        System.out.println(findSqrt(n,p));

    }
    static  boolean isprimeNum(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while (c*c<=n){  // or c==Math.sqrt(n)
            if (n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
    //prime number

    static  void isprimenum1(int n,boolean[] prime){
        for (int i=2;i*i<=n;i++){
            if (!prime[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    prime[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if (!prime[i]){
                System.out.print(i+" ");
            }

        }
    }
    //finding sqrt of a number
    static double findSqrt(int n,int p){
        int start=0;
        int end =n;
        double root=0.0;
        while (start<end){
            int mid=start+(end-start)/2;
            if (mid * mid==n){
                root=mid;
                return mid;
            }
            if (mid*mid>n){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        double incr=0.1;
        for (int i = 0; i <p ; i++) {
            while (root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }


}
