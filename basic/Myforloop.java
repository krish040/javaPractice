import java.util.Scanner;

public class Myforloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("fact of "+num+": "+fact);
        sc.close();
    }
}
