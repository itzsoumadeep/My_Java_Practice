public class bitwise {
    public static void main(String[] args) {
        int n=15;
        int base=16;
        int target=1;
        int[] arr={4,5,2,4,3,5,2};
        int[] nums={2,2,3,2,7,7,8,7,8,8};
        int base1=2;
        int power1=4;
        System.out.println(Power(power1,base1));
//        System.out.println(getOdd(n));
//        System.out.println(duplicateVal(arr));
//        System.out.println(findBit(n,target));
//        System.out.println(magicNum(n));
//        System.out.println(calculateDigits(n,base));
//        System.out.println(findPowofTwo(base));
    }

    //find the number is odd or even without using bitwise operator
    private static Object getOdd(int n) {
        return (n & 1)==1;
    }
    //in an array find an element that appearing once
    static int duplicateVal(int[] arr){
        int unique=0;
        for (int n:arr){
            unique ^= n;
        }
        return unique;
    }
    //find i'th bit of a number
    static  int findBit(int n,int target){
        int ans=(target &(1<<(target-1)));
        return ans;
    }
//    set the i'th bit
    static int setBit(int n,int target){
        int ans=~(1<<(target-1));
        return ans;
    }
    //find n th magic number
    static  int magicNum(int n){
        int ans=0;
        int base=5;
        while (n>0){
            int last=n & 1;
            n=n>>1;
            ans+= last *base;
            base=base*5;
        }
        return ans;
    }
    //how many digit in specific base
    static int calculateDigits(int n,int base){
        int ans=(int)(Math.log(n)/Math.log(base))+1;
        return ans;
    }
    // find num that are pow of 2 or not
    static boolean findPowofTwo(int n){
        if (n==0){
            return false;
        }
        boolean ans=(n & (n-1))==0;
        return ans;

    }
    //find power of som num with minimum time complicity
    static int Power(int power,int base){
        int ans=1;
        while (power>0) {
            if ((power & 1) == 0) {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        return ans;
    }


}
