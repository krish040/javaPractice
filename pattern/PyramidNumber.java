public class PyramidNumber {
    public static void main(String[] args) {
        int num=4;
        int space=num-1;
        for(int i=1;i<=num;i++){
            for(int x=space;x>0;x--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");;
            }
            System.out.println();
            space--;
        }
    }
}
