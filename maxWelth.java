public class maxWelth {
    public static void main(String[] args) {
        int[][] num={
                {1,2,3},
                {3,2,1}
        };
        int nums= maximumWealth(num);
        System.out.println(nums);
        
    }
    public static int maximumWealth(int[][] accounts) {
        //person= row
        //account=  col
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person <accounts.length ; person++) {
            int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum=sum+ accounts[person][account];
            }
            if(sum>ans){
                ans=sum;

            }

        }
        return ans;

    }
}
