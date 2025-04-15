class Trace2{
	static int x;
	static int y=10; 
	static int z =add(); //7
	public void m2(){
		System.out.println("m2");
	}
	public static void main(String[] args){
		System.out.println("hello world");
		m1();
		System.out.println("    bye");
		m1();
		System.out.println(z);
		int a =add();//7
		System.out.println(a);
	}
	public static void m1(){
		
		System.out.println("from m1");
		System.out.println(x+y);
	}

	public static int add(){
		
		System.out.println("addition");
		return 7;
	}
}
/*
o/p 
addition
hello world
from m1
10
bye
from m1
10
7
addition 
7
*/