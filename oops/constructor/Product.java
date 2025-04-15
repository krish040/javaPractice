class Product{
	int pid;
	String pname;

	public Product(int id,String name){
		System.out.println("hiiiiiiiiiiii");
		//pid=id;
		//pname=name;
	}
	public static void main(String[] arga){
		Product p=new Product(101,"aaaaaaaaa");
		Product p1=new Product (102,"bbbbbbbb");
		Product p2=new Product (103,"ccccccc");
	
		System.out.println(p.pid);
		System.out.println(p.pname);

		System.out.println(p1.pid);
		System.out.println(p1.pname);
	
		System.out.println(p2.pid);
		System.out.println(p2.pname);
		
	}

}
