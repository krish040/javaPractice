public class NumberIncreasingPyramid {

    public static void reverseInverse(int row){
        for(int i=row;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void reverse(int row){
        for(int i=0;i<row;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void numberIncreasingPyramid(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row=5;
        //numberIncreasingPyramid(row);
        //reverseInverse(row);
        reverse(row);
    }
}
