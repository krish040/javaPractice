public class Mock1 {
    public static void main(String[] args){
        int n=6;
        for(int i=1;i<=n;i++){
                for(int j=n-i;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++){
                    System.out.print("*");
                    //space inbetween
                    for(int l=1;i<=k;l++){
                        System.out.print(" ");
                    }
                }
                System.out.println();
                /*
         *       // i=1  , 2, 3, 4, 5, 6
        * *      //j =5,   4,               3, 2, 1 space
       *   *     // k= 1,  2
      *     *
     *       *
    ***********
    */
             }
    }
}