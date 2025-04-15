class Demo{
	static int i;
	static int j;
	public static void main(String[] args){
		System.out.println(i);
		i=20;
		m1();
	}
	public static void m1(){
		System.out.println(i);
	}
}

/*
output:
0
20
*/