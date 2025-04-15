public class Demo1{
	int a=10;
	int b;
	
	public Demo1(){
		System.out.println("I am a constructor");
		System.out.println(b);
		b=20;
	}
	public static void main(String[] args){
		Demo1 d=new Demo1();//
		System.out.println(d);
		System.out.println(d.a);
		System.out.println(d.b);
		Demo1 d1=new Demo1();
		System.out.println(d1);
		System.out.println(d1.a);
		System.out.println(d1.b);

		d1.a=8;
		d.b=9;
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d.a);
		System.out.println(d.b);
		m1();
	}
	public static void m1(){
		Demo1 d=new Demo1();
		System.out.println(d.a);
	}
}