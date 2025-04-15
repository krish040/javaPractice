class Student{
	String name;
	int roll;
	float percentage;
	String email;
	char section;

	Student(){
	    System.out.println("Student created");
	}
	Student(String name,int roll,float percentage,String email,char section){
	      this(name,roll,percentage,email);
	    //this.name=name;
	    //this.roll=roll;
	    //this.percentage=percentage;
	    //this.email=email;
	    this.section=section;
	}
	Student(String name,int roll,float percentage,String email){
	    this(name,roll,percentage);
	    //this.name=name;
	    //this.roll=roll;
	    //this.percentage=percentage;
	    this.email=email;
	}
	Student(String name,int roll,float percentage){
	     this(name,roll);
	    //this.name=name;
	    //this.roll=roll;
	    this.percentage=percentage;
	}
	Student(String name,int roll){
	    this(name);
	    //this.name=name;
	    this.roll=roll;
	}
	Student(String name){
		//this(name);
	    this.name=name;
	}
	
	void printDetails(){
		System.out.println(name);
		System.out.println(roll);
		System.out.println(percentage);
		System.out.println(email);
		System.out.println(section);
	}
	public static void main(String[] args){
		Student s1=new Student();
		Student s2=new Student("user2",2,77.77f,"user2@gmail.com",'A');
		Student s3=new Student("user3",3,88.88f,"user3@gmail.com");
		Student s4=new Student("user4",4,99.99f);
		Student s5=new Student("user5",5);
		Student s6=new Student("user6");

		s2.printDetails();
		
		
		
	}
}