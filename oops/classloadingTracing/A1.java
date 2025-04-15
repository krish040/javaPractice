class A1{
	static int a1=10;
	public static void main(String[] args){
		System.out.println("main started");
		System.out.println(a1);
	}
	static {
		System.out.println("SMLI");	
	}
}

/*
output
SMLI
main started
10
*/
