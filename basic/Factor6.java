class Factor6{
	public static void main(String[] args){
		int n=36,sum=0; 		//36=91 , 6=12;
		for(int i=1; i*i<=n ; i++){
			if(n%i == 0){
			    sum+=i;
			    if(n/i != i){
			        sum+=n/i;
			     }
			}
		}
		System.out.println("sum:"+sum);
	}
}