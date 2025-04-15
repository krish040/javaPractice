public class Pyramid {
    public static void reverseLeft(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void left(int n) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void right(int n){
        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void reverseRight(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=n-i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=5;
        left(n);
        System.out.println(" ");
        reverseLeft(n);
        System.out.println("");
        right(n);
        System.out.println("");
        reverseRight(n);
    }
}
