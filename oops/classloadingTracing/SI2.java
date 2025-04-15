class SI2{
	static int a=demo()+test(); //5+3=8    //1
	static String var1;//null // ram
	static{
		System.out.println("SMLI1");
		demo();
	}
	public static void main(String[] args){
		System.out.println("Starts of main");
		var1="ram";
		demo();
		System.out.println(a);
		System.out.println("ends of main");
	}
	public static int demo(){
		System.out.println(var1);
		return 5;
	}
	public static int test(){
		System.out.println("i am test");
		return 3;
	} 
	static{
		System.out.println("SMLI2");
		a=1;
	}
}

/*
output:

null
i am test
SMLI1
null
SMLI2
Starts of main
ram
1
ends of main

*/