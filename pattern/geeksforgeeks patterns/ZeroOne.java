public class ZeroOne {
    public static void main(String[] args) {
        int n=5;//,digit=0;
        // for(int i=1;i<=n;i++){
        //     if(i%2==0)
        //         digit=1;
        //     else
        //         digit=0;
        //     for(int j=1;j<=i;j++){
        //         System.out.print(digit+" ");
        //         if(digit==0)
        //             digit=1;
        //         else
        //             digit=0;
        //     }
        //     System.out.println();

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2!=0)
                    System.out.print(0+" ");
                else
                    System.out.print(1+" ");
            }
            System.out.println();
        }
    }
}
