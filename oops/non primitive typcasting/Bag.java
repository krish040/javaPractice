import java.util.Scanner;

public class Bag {
    public static void main(String[] args) {
        Bag bag;
        System.out.println("1 for onion. \n2 for Garlic.\nEnter a value:");
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        switch (data){
            case 1:
                bag=new Onion(); //upcasting
                System.out.println(bag);
                Onion onion=(Onion)bag; //downcasting
                System.out.println(onion.color);
                break;
            case 2:
                bag=new Garlic(); //upcasting
                System.out.println(bag);
                Garlic garlic=(Garlic)bag; //downcasting
                System.out.println(garlic.color);
                break;
            default:
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}
