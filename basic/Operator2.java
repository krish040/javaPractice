import java.util.Scanner;
public class Operator2 {
    static int a=10;
    //a=10;
    public static void main(String[] args){
        System.out.println(a);

        //int a=10,b=20;
        //int c=a++ + --b;
        //int c =a++ - --a+ b++ + --a;
        // Scanner myobj =new Scanner(System.in);

        // System.out.println("Enter value of a:");
        // int a=myobj.nextInt();
        // System.out.println("Enter the value of b:");
        // int b=myobj.nextInt();
        // System.out.println(a+b);
        
        // myobj.close();

        // byte x=2;
        // {x=100;
        // System.out.println(x);//
        // }
        // System.out.println(x);
        // //x=200; //CTE
        // //int y,z;
        // //y,z=100;
        // int c='a';
        // System.out.println(c);
        // boolean b=true;
        // //int i=(int)b; //boolean cannot be converted to int
        // String s="a";
        // b=s.equals("a");
        // System.out.println(b);
        // System.out.println(4+"hello"+45+5);
        // int grade=45;
        // String cz= grade>=90? "a": grade>=80 ? "B": grade>=70 ? "C": grade>=60? "d": grade>=50?"e": "f";
        // System.out.println(cz);

        int year=1600;
        String s=year%4==0? year%100!=0?"yes":"no":"no";
        System.out.println(s);
    }
}
