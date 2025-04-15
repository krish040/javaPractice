public class Demo{
	int a=30;
	int[] m1(){
		//a=20;
		//System.out.println(a);
		char []a={'a','b','c'};
		return a;
	}
 	public static void main(String[] args){
		Demo d=new Demo();
		int[] arr=d.m1();	
		System.out.println(arr[0]);
		
	}
}
