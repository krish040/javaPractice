class B{
	static int i;  //9  //89
	static{
	      i=9;
	}
	public static void main(String [] args){
	       System.out.println(A.a);//0
	       i=89;
	}
}

/*
output:
0

*/
