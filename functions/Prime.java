public class Prime {

    public static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void primeRange(int n){
        int count=1,digit=1;
        while(count<=n){
            if(isPrime(digit)) {
                System.out.print(digit+" ");
                count++;
                digit++;
            }
            else
                digit++;
        }
    }

    public static int nthPrime(int n){
        int count=0,i=2;
        while (count<n){
            if(isPrime(i)){
                count++;
            }
            i++;
        }
        return i-1;
    }

    public static void main(String[] args) {
        int n=25;
        // System.out.println(isPrime(n));
        // primeRange(n); //first 10 prime numbers
        System.out.println(nthPrime(n)); 

    }
}
// hw
// given number is prime or not
// prime no 1 to 10
// find the nth (5th )prime no // 2,3,5,7,ans=11
// first 30 prime number is  2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31
// 12th =37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, and 97. 

