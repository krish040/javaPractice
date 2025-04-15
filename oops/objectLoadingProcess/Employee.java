class Employee{
	static String compant_name="pyss";
	String ename;
	int eid;
	double salary;
	int dno=40;
	public Employee(String name, int id, double sal){
		ename=name;   //
		eid=id;
		salary=sal;
		System.out.println("data updated");
	}

	public void addName(String name){
		ename=name;
		System.out.println("name updated");
	}

	public void addId(int id){
		eid=id;
	}
	
	public void addSal(double sal){
		salary=sal;
	}

	public String updateData(String name, int id, double sal){
		ename=name;
		eid=id;
		salary=sal;
		//
		return "data updated";
	}

	public void printDetails(){
		System.out.println( this.ename);
		System.out.println(eid);
		System.out.println(salary);
	}

	public static void main(String [] args){
		Employee e1=new Employee("rupesh",78,777777);
		
		Employee e2=new Employee("neha",67,8888888);
		e1.printDetails();
		e2.printDetails();
		System.out.println(e1.compant_name);
		//e1
		e2.addName("Debasis");
		String ename="hy";
	}
}