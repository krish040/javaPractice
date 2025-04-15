public class MirroredPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            //star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //space
            for(int k=1;k<=(2*n)-1-(2*i);k++){
                System.out.print("  ");
            }
            //star
            for(int m=1;m<=i;m++){
                if(m==n){
                    break;
                    //m<=i && m!=n
                }
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
