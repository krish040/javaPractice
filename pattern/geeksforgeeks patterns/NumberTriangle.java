public class NumberTriangle {
    public static void numberTraiangular(int row) {
        for(int i=1;i<=row;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void reverseImage(int row){
        for(int i=1;i<row;i++){
            for(int j=row-1-i;j>0;j--){
                System.out.print(" ");
            }
            for(int j=row-i;j<=row;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        numberTraiangular(6);
        reverseImage(6);
    }
}
