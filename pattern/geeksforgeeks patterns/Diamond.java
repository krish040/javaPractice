public class Diamond {

    public static void solid(int row){
        for (int i = 1; i <= row; i++) {

            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=1;i<row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=row-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow(int row){
        printHollowTriangle(row);
        reverseHollow(row);
    }


    public static void printHollowTriangle(int row){
        for(int i=1;i<=row;i++){

            //for space
            for(int j=row-i;j>0;j--){
                System.out.print("  ");
            }

            //for star
            for(int k=1;k<=2*i-1;k++){
                if(k==1||k==2*i-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void reverseHollow(int row){
        for(int i=2;i<=row;i++){
            for(int j=2;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*row-2*i+1;j++){
                if(j==1||j==2*row-2*i+1)
                System.out.print("* ");
                else
                System.out.print("  ");
            }
            System.out.println();

        }
    }


    public static void main(String[] args) {
        int row = 5;
        //solid(row);
        hollow(row);

    }
}
