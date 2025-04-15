public class Plus {

    public static void oddPlus(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==row/2+1 || j==row/2+1 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void evenPlus(int row){
        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                if(i==row/2 || j==row/2 ){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row = 6;
        if(row%2!=0)
        oddPlus(row);
        else
        evenPlus(row);
    }
}
