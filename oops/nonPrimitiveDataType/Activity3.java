class Activity2{

	public static void  demo(int a){
		System.out.println("hello");
	}

	public static void  demo1(int a ,float f){
		System.out.println("hii");
	}
	public static void  demo2(int a, float f, double d){
		System.out.println("Bye");	
	}
	public static void  demo3(int a, float f, double d){
		System.out.println("Bye2");
	}
	public static void  demo4(int a, float f, double d,char c,String s){
		System.out.println("bye3");
	}
	public static void main(String[] args){

		demo(10);
		demo1(1,1.0f);
		demo2(2,2.0f,2);
		demo3(1,1.1f,20);
		demo4(2,3.0f,2.6,'h',"hey");
	}


}