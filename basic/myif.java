import java.util.Scanner;
public class myif {
    public static void main(String[] args) {
        System.out.println("main starts");
        System.out.println("enter the number:");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
        System.out.println("main ends");
        scan.close();
    }
}
