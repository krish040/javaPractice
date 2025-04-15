class SumOfEvenDigit{
	public static void main(String[] args){
		int n=324,temp=324,sum=0;
		while(temp>0){
		      if((temp%10)%2==0){
		          sum+=temp%10;
		      }
		      temp/=10;
		}
		System.out.println("sum:"+sum);
	}

}