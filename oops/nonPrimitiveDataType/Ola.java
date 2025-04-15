class Ola{
	public static void main(String [] args){
		/*
		System.out.println("\nprintDetails method called with ClassName");
		User.printDetails();

		System.out.println("id: "+User.id);
		System.out.println("password: "+User.password);
		System.out.println("name: "+User.name);
		System.out.println("phno: "+User.phno);
		System.out.println("address: "+User.address);

		System.out.println("\nprintDetails method called with Obj Ref");
		User u1=new User();
		u1.printDetails();

		System.out.println("id: "+u1.id);
		System.out.println("password: "+u1.password);
		System.out.println("name: "+u1.name);
		System.out.println("phno: "+u1.phno);
		System.out.println("address: "+u1.address);
		*/

		Driver d=new Driver();
		System.out.println(d.name);
		System.out.println(d.age);
		System.out.println(d.vehicle);
		System.out.println(d.address);
		System.out.println(d.phno);
		
		System.out.println(Driver.name);
		System.out.println(Driver.age);
		System.out.println(Driver.vehicle);
		System.out.println(Driver.address);
		System.out.println(Driver.phno);
		

	}
}