public class Fibonacci{
    
    public static void fibonacci(){
        int first=0,second=1,n=10;
        System.out.print(first+" "+second+" ");
        for(int i=1;i<=n;i++){
            int next=first+second;
            System.out.print(next+" ");
            first=second;
            second=next;
        }
    }

    public static void main(String[] args) {
        fibonacci();
    }
}