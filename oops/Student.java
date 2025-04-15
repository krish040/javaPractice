class Student{
	static int roll=7;
	static String name="xyz";
 	public static void printName(){
		System.out.println(name);
	} 
	public static void printRoll(){
		System.out.println(roll);
	}
	
	int enroll_id=2113;
	String course="java";
	public void printid(){
		System.out.println(enroll_id);
	} 
	public void printCourse(){
		System.out.println(course);
	}

	public static void main(String[] args){
		System.out.println(roll);
		System.out.println(name);
		printName();
		printRoll();
		
		Student obj=new Student();
		System.out.println(obj.enroll_id);
		System.out.println(obj.name);
		obj.printid();
		obj.printCourse();
		
	}

}