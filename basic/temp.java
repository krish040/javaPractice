import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter temp:");
        int temp=scan.nextInt();
        System.out.println("temp:"+temp);
        
        if(temp>0){
            System.out.println("if");
        }else{
            System.out.println("else");
        }
        
        scan.close();
    }
}
