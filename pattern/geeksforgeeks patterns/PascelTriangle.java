public class PascelTriangle {

    public static void nthrow(int row){
        int ans=1;
        System.out.print(ans+" ");
        for (int i = 1; i < row; i++) {
            ans=ans*(row-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }

    public static void main(String[] args) {
        int row = 5;
        for (int i = 1; i <=row; i++) {
            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            nthrow(i);
            System.out.println();
        }
    }
}
