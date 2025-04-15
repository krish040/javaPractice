class Demo2{
	int a=10;
	int b;
	static int p;
	static int q=90;
	static{
		System.out.println("SML1");
	}
	{	
		System.out.println("i am non static multi line initializer");
	}
	public Demo2()
	{
		System.out.println("i am constructor");
		System.out.println(b);
		b=20;
	}
	public void add(){
		System.out.println("i am add method");	
	}
	public static void main(String[] args){
		Demo2 d =new Demo2();
		System.out.println(d);
		System.out.println(d.a);
		System.out.println(d.b);
		
		d.add();
		Demo2 d1=new Demo2();
		Demo2 d2= new Demo2();


		d.a=70;
		d.b=60;
		d1.a=99;
		d1.b=88;
		d2.a=77;
		d2.b=66;

		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d2.a);
		System.out.println(d2.b);
		
	}
}