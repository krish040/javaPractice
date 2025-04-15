//Strong number
public class Strong {
 
    public static int fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
 
    public static void checkStrong(int n){
        int sum = 0;
        int original = n;
        while (n != 0) {
            int remainder = n % 10;
            sum += fact(remainder);
            n /= 10;
        }
        if(sum==original){
            System.out.println(original + " is a strong number");
        }
        else{
            System.out.println(original + " is not a strong number");
        }
    }
    public static void main(String[] args) {
        // 145=1!+4!+5!
        int n=146;
        checkStrong(n);
    }
}
