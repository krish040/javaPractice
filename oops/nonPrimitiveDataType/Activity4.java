class Activity4{
 	public static int m1(int a){
		System.out.println("return int");
		return a;
	}
	public static boolean m2(int i,float f){
		System.out.println("return boolean");
		return true;
	}
	public static char m3(boolean b , float f , double d){
		System.out.println("return char");
		return 'a';
	}
	public static String m4(int i, int j, float f , double d){
		System.out.println("return string");
		return "hello";
	}
	public static float m5(int i, long l , float f, double d, char c, String s){
		System.out.println("return float");
		return f;
	}

	public static void main(String[] args){
		
		System.out.println(m1(5));
		System.out.println(m2(5,5.5f));
		System.out.println(m3(true,5.5f,5.6));
		System.out.println(m4(5,6,5.5f,5.6));
		System.out.println(m5(5,6l,5.5f,5.6,'a',"hello"));
		
	}
}