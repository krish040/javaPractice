public class Transpose {
    public static void main(String[] args) {

        int a[][]={{1,2,3},{4,5,6},{7,8,9}};

        int row=a.length;
        int col=a[0].length;
        //System.out.println(row);
        //System.out.println(col);

        //int b[][]=new int[col][row];

        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col;j++){
        //         b[j][i]=a[i][j];
        //     }
        // }

        // for(int i=0;i<col;i++){
        //     for(int j=0;j<row;j++){
        //         b[i][j]=a[j][i];
        //     }
        // }

        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){ // when j=0 , then elements swapped twice , came at their original position
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        Helper.print2Darray(a, col, row);
    }
}
