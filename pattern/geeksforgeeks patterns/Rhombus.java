public class Rhombus {

    public static void rhombus(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverse(int row) {
        for(int i=1;i<=row;i++){
            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=row;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 5;
        //rhombus(row);
        reverse(row);
    }
}
