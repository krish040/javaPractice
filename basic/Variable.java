class Variable{
	public static void main(String[] args){
		int a=40,c=10;//allowed
		//int a,b,c=10,20,30;// NOT allowed
		//c=a=15;
		System.out.println(a);
		//System.out.println(b);
		System.out.println(c);
		{int x;}
		//System.out.println(x);
	}
}