public class Matrix {
    public static void main(String[] args) {
        int row_size=3,col_size=3;
        
        int a[][];
        a=new int[row_size][col_size];

        char c[][]=charArray(row_size, col_size);
        
        
        
        //print 2darray
        Helper.print2Darray(a, row_size, col_size);
    }
    
    public static char[][] charArray(int row_size,int col_size){
        char c[][]=new char[row_size][col_size];
        for(int i=0;i<row_size;i++){
            for(int j=0;j<col_size;j++){
                c[i][j]=10;
            }
        } 
        return c;  
    }
}
