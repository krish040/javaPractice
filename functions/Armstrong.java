//power of count of digits
//12=1^2 +2^2 =1+4=5 not 
//1234= 1^4 +2^4 +3^4 +4^4 =1+16+81+256=354 not
public class Armstrong {
    public static int countDigits(int num){
        int count = 0;
        while(num != 0){
            num = num / 10;
            count++;
        }
        return count;
    }

    public static int myPower(int num,int exponent){
        int digit=1;
        for(int i=1;i<=exponent;i++){
            digit = digit * num;
        }
        return digit;
    }
    public static void checkArmstrong(int num){
        int sum=0,n = num, exponent=countDigits(num);
        while(n!=0){
            int r = n%10;
            //sum = sum + (int)Math.pow(r,exponent);// by default return double
            sum=sum+myPower(r, exponent);
            n = n/10;
        }
        if(sum == num){
            System.out.println(num + " is an Armstrong number");
        }
        else{
            System.out.println(num + " is not an Armstrong number");
            
        }
    }
    public static void main(String[] args) {
        int num = 153;//153 ,1634
        // int pow = countDigits(num);
        checkArmstrong(num);
    }
}
