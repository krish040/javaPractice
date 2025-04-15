public class ButterFlyStarPattern {
    public static void main(String[] args) {
        int row=4;//,digit=0;
        // for(int i=1;i<=row;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=(2*row-3)-digit;j++){
        //         System.out.print(" ");
        //     }
        //     digit+=2;
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //         if(i==row &&j==row-1){
        //             break;
        //         }
        //     }
        //     System.out.println();
        // }

        // //downside pattern
        // for(int i=1;i<row;i++){
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=2*i-1;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=row-i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        for(int i=1;i<=row;i++){
            for(int j=1;j<=2*row-1;j++){
                if(j>i && j<2*row-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=row-1;i>0;i--){
            for(int j=1;j<=2*row-1;j++){
                if(j>i && j<2*row-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
