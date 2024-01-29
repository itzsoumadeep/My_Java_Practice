public class sumProductDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(1253));
        System.out.println(productDigits(1253));
    }
    //sum of digints
    static int sumDigits(int n){
        if (n==0){
            return 0;
        }

        return (n%10) +sumDigits(n/10);
    }
    //product of digits
    static int productDigits(int n){
        if (n%10==n){
            return n;
        }
        return (n%10)+productDigits(n/2);
    }
}
