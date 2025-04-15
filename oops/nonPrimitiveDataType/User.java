class User{

	static int        id=101;
	static String  password="123abc";
	static String  name="xyz";
	static long     phno=987654321;
	static String  address="123,gurugram";

	public static void printDetails(){

		System.out.println();
		//direct
		System.out.println("id: "+id);
		System.out.println("password: "+password);
		System.out.println("name : "+name);
		System.out.println("phno : "+phno );
		System.out.println("address : "+address);
		
		System.out.println();
		//CLASS NAME
		System.out.println("id: "+User.id);
		System.out.println("password: "+User.password);
		System.out.println("name: "+User.name);
		System.out.println("phno: "+User.phno);
		System.out.println("address: "+User.address);

		System.out.println();
		//obj ref
		User u2=new User();
		System.out.println("id: "+u2.id);
		System.out.println("password: "+u2.password);
		System.out.println("name: "+u2.name);
		System.out.println("phno: "+u2.phno);
		System.out.println("address: "+u2.address);

	} 

	public static void main(String [] args){
		
		System.out.println();
		System.out.println("DIRECTLY");
		printDetails();
		
		System.out.println();
		System.out.println("CLASS NAME");
		User.printDetails();

		System.out.println();
		System.out.println("OBJ REF");
		User u1=new User();
		u1.printDetails();
		
	}
}