public class PalindromeTriangle{
    public static void palindromeTriangle(int row){
        // for(int i=1;i<=row;i++){
        //     //space
        //     for(int j=row-i;j>0;j--){
        //         System.out.print(" ");
        //     }
        //     //digits
        //     int digit=i;
        //     for(int k=1;k<=2*i-1;k++){
        //         System.out.print(digit);
        //         if(k<=(2*i-1)/2){
        //             digit--;
        //         }
        //         else{
        //             digit++;
        //         }
        //     }
        //     System.out.println();
        // }


        for (int i = 1; i <= row; i++) {
            // inner loop to print the spaces
            for (int j = 1; j <= 2 * (row - i); j++) {
                System.out.print(" ");
            }

            // inner loop to print the first part
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            // inner loop to print the second part
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }

            // printing new line for each row
            System.out.println();
        }
    }

    public static void main(String[] args){
        int row=5;
        palindromeTriangle(row);
    }
}