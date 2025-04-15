class Activity2{
	public static int m1(){
		System.out.println("return int");
		return 5;
	}
	public static boolean m2(){
		System.out.println("return boolean");
		return true;
	}
	public static char m3(){
		System.out.println("return char");
		return 'a';
	}
	public static String m4(){
		System.out.println("return string");
		return "hello";
	}
	public static float m5(){
		System.out.println("return float");
		return 5.8f;
	}
	public static void main(String[] args){
		m1();m2();m3();m4();m5();
	}

}