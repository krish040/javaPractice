import java.util.Scanner;
class Grade{
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number scored:");
        int num=scan.nextInt();

        if(num>=90 && num<=100)
            System.out.println("1A");
        else if(num>=75)
            System.out.println("B");
        else if(num>=50)
            System.out.println("C");
        else if(num>=35)
            System.out.println("D");
        else
            System.out.println("F");
        scan.close();

    }
}