public class K {

    public static void printK(int row) {
        for (int i = 1; i < row; i++) {
            for(int j=i;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=2;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    

    public static void main(String[] args) {
        int row=10;
        printK(row);
    }
}
