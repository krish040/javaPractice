
public class Reverse {
    public static int doReverse(int n){
        int rev=0,rem=0;
        while(n!=0){
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }

    public static void checkPalindrome(int n){
        if(n==doReverse(n)){
            System.out.println("yes palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        int n=32223;
        System.out.println(n+": "+doReverse(n));
        checkPalindrome(n);        
    }
}
