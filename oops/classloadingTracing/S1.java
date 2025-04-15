class S1{
	static int a=test();//10
	int c=10;
	static int b=20; //40
	static {
		System.out.println(b);
		b=40;
	}

	{
		
		System.out.println("hy");
	}

	public void m1(){
		
		System.out.println("m1");
	}

	public static int test(){
		System.out.println(b);
		return 10;
	}

	public static void main(String[] args){
		test();
	}
}

/*
output:
0
20
40

*/