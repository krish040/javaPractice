public class CharacterPyramid {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            int ch=65;
            for(int j=1;j<=i;j++){
                System.out.print((char)ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
