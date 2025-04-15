public class Helper {

    public static void print2Darray(int a[][],int row_size,int col_size){
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void printChar2Darray(int a[][],int row_size,int col_size){
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }

    

}
