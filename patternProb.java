public class patternProb {
    public static void main(String[] args) {
        pattern7(5);

    }
    static void pattern2(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");

            }
            //when one row was printed the we need to add a new line
            System.out.println();
        }
    }
    static void pattern1(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=n-row+1 ; col++) {
                System.out.print("* ");

            }
            //when one row was printed the we need to add a new line
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <=n ; row++) {
            for (int col = 1; col <=row ; col++) {
                System.out.print(col+" ");

            }
            //when one row was printed the we need to add a new line
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 1; row <=2*n ; row++) {
            int totalColsInRow=row>n ? 2*n-row+1:row;
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");

            }
            //when one row was printed the we need to add a new line
            System.out.println();
        }
    }
    static void pattern6(int n){
        for (int row = 1; row <=2*n ; row++) {
            int totalColsInRow=row>n ? 2*n-row+1:row;
            int noOfSpaces=n-totalColsInRow;
            for (int sp = 0; sp <noOfSpaces ; sp++) {
                System.out.print("  ");
            }
            for (int col = 0; col <totalColsInRow ; col++) {
                System.out.print("* ");

            }
            //when one row was printed the we need to add a new line
            System.out.println();
        }
    }
    static void pattern7(int n){
        for (int row = 1; row <n ; row++) {

            for (int spaces = 0; spaces <n-row ; spaces++) {
                System.out.print("  ");
            }
            for (int col = row; col>=1 ; col--) {
                System.out.print(col+ " ");
            }
            for (int col = 2; col <=row ; col++) {
                System.out.print(col+" ");
            }
        System.out.println();
        }
    }
}
