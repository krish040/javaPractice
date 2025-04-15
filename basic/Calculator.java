// import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("enter num1:");
        // int num1=sc.nextInt();
        // System.out.println("enter num2:");
        // int num2=sc.nextInt();
        // System.out.println("enter choice");
        // System.out.println("1. addition");
        // System.out.println("2. substraction");
        // System.out.println("3. multiplication");
        // System.out.println("4. division");
        // System.out.println("enter:");
        // int choice=sc.nextInt();
        // switch(choice){
        //     case 1:
        //         System.out.println(num1+num2);
        //         break;
        //     case 2:
        //         System.out.println(num1-num2);
        //         break;
        //     case 3:
        //         System.out.println(num1*num2);
        //         break;
        //     case 4:
        //         System.out.println(num1/num2);
        //         break;
        //     default: System.out.println("invalid");
        // }
        // sc.close();

        int year=2001;
        String s=(year%4==0 && year !=0 )|| year%400==0? "yes":"no";
        System.out.println(s);
    }
}
