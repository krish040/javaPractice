public class NumberChangingPyramid{
    public static void main(String[] args) {
        int row = 5,digit=1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(digit + " ");
                digit++;
            }
            System.out.println();
        }
    }
}