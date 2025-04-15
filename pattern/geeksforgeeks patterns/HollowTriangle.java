public class HollowTriangle {

    public static void solidTriangle(int row){
        //int digit=0;
        for(int i=1;i<=row;i++){
            //for space
            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }

            //for star
            for(int j=1;j<=2*i-1;/*j<=i+digit*/j++){
                System.out.print("*");
            }
            //digit++;
            System.out.println();
        }
    }

    public static void printHollowTriangle(int row){
        for(int i=1;i<=row;i++){

            //for space
            for(int j=row-i;j>0;j--){
                System.out.print("  ");
            }

            //for star
            for(int k=1;k<=2*i-1;k++){
                if(k==1||k==2*i-1||i==row){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void reverse(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*row-2*i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseHollow(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*row-2*i+1;j++){
                if(i==1||j==1||j==2*row-2*i+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();

        }

        // for (int i = row; i >= 1; i--) {

        //     // inner loop to print spaces.
        //     for (int j = i; j < row; j++) {
        //         System.out.print(" ");
        //     }

        //     for (int k = 1; k <= (2 * i - 1); k++) {
        //         // printing stars.
        //         if (k == 1 || i == row || k == (2 * i - 1)) {
        //             System.out.print("*");
        //         }
        //         // printing spaces.
        //         else {
        //             System.out.print(" ");
        //         }
        //     }

        //     System.out.println("");
        // }
    }

    public static void main(String[] args) {
        int n = 5;
        //solidTriangle(n);
        //printHollowTriangle(n);
        //reverse(5);
        reverseHollow(n);
    }
}
