//3.WAP to store int value into byte,short,long,float,double,char type.
class OneToAll{
	public static void main(String[] args){
		/*
		int num=31456; // 4bytes
		//widening
		long l_num=num;
		float f_num=num;
		double d_num=num;
		System.out.println("long: "+l_num);
		System.out.println("float: "+f_num);
		System.out.println("double: "+d_num);
		
		//narrowing
		byte b=(byte) num;
		short s=(short) num;
		char c=(char) num;
		System.out.println("byte: "+b);
		System.out.println("short: "+s);
		System.out.println("char: "+c); //output is ?
		*/

		/*
		//4. WAP to convert double 56.09 into int
		double d=56.09;
		int num=(int) d;
		System.out.println("int: "+num); //56
		*/
		
		/*
		//5. WAP to store char 'A' into int and short
		char c='A';
		int i=(int) c; //65
		short s=(short) c; //65
		System.out.println("A int: " + i + ",short: " +s);
		*/
		
		//6. WAP to store boolean true inside int
		boolean b=true;
		//int num=(int) b;
		//System.out.println(num); // error: incompatible types: boolean cannot be converted to int
	}
}