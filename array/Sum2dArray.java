// import java.util.Scanner;
//maximum element in each row if matrix
// check given 2 matrix are identical or not
class Sum2dArray{

    public static void main(String[] args){

        int row_size=3,col_size=3;
        // int a[][]=new int[3][3];

        //Scanner scan=new Scanner(System.in);
        int sum=0;//,max=a[0][0];

        System.out.println("enter 9 values for matrix:");
        for(int i=0;i<row_size;i++){
            //int max=a[i][0];
            for(int j=0;j<col_size;j++){
                //a[i][j]=scan.nextInt();
                //sum+=a[i][j];
                // if(a[i][j]>max){
                //     max=a[i][j];
                // }
            }
            //System.out.println("max:"+max);
        }

        // for( int i[]: a){
        //     for(int j:i){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j]+" ");
        //     }
        //     System.out.println();

        // }

        //Helper.print2Darray(a, row_size, col_size);
        System.out.println("sum:"+sum);
    }
}