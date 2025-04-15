class School{
	public static void main(String[] args){
		System.out.println(Student.roll);
		System.out.println(Student.name);
		Student.printName();
		Student.printRoll();

		Student obj=new Student();
		obj.printid();
		obj.printCourse();
		System.out.println(obj.enroll_id);
		System.out.println(obj.course);


	}
}