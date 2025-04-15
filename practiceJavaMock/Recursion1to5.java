public class Recursion1to5{
	public static void main(String [] args){
		//m1(5);
		//m2(1);
		//System.out.println(fact(5));
		//System.out.println(sumNaturalNum(5));
		//System.out.println(fib(6));
		//System.out.println(isPrime(6,2));
		//System.out.println(reverseString("Hhello",6-1,""));
		//System.out.println(reverseString("Hhello",6-1));
		//numInRange(20,30);
		System.out.println(reverseNum(12034,0));
	}
	public static void m1(int i){
		if(i<=0) return;
		else m1(i-1);
		System.out.println(i);
	}
	public static void m2(int i){
		if(i>5) return;
		else m2(i+1);
		System.out.println(i);
	}
	public static int fact(int n){
		if(n<=0) return 1;
		return n*fact(n-1);
	}
	
	public static int sumNaturalNum(int n){
		if(n<=0) return 0;
		return n+sumNaturalNum(n-1);
	}
	public static int fib(int n){
		if(n==0) return 0;
		if(n==1) return 1;
		return fib(n-1)+fib(n-2);
	}
	public static boolean isPrime(int n,int divisor){
		if(n<2) return false;
		if(n==2 || n==3) return true;
		if(divisor*divisor>n) return true;
		if(n%divisor ==0) return false;
		return isPrime(n,divisor+1);
	}
	public static String reverseString(String word,int len,String rev){
		if(len<0) return rev;
		rev=rev+word.charAt(len);
		return reverseString(word,len-1,rev);
	}
	public static String reverseString(String word,int len){
		if(len<0) return "";
		return word.charAt(len)+reverseString(word,len-1);
	}
	
	public static void numInRange(int lower,int upper){
		if(lower>upper) return;
		System.out.print(lower+" ");
		numInRange(lower+1,upper);
	}

	public static int reverseNum(int num,int rev){
		if(num<=0) return rev;
		rev=rev*10+num%10;
		return reverseNum(num/10,rev);
	}
	
}