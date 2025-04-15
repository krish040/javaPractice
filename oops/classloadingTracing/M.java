class M{
	static int p=7;
	int a=9;
	int b=5;
	static int q=67;

	{
	    System.out.println("MLSI1");
	}

	public void m1(){
	    System.out.println("m1() method");
	}

	static{
	     System.out.println("MLSI");
	}

	public static void m2(){
	     System.out.println("m2() method");
	}

	public static void main(String [] args){
		int p=90;//local
		//System.out.println(a);
		m2();
		System.out.println(M.p);//static
		System.out.println(p);//local
		int a =5;
		System.out.println(a);//5
	}
}

/*
output:

MLSI
m2()method
7
90
5

*/