public class MergeSort{
	public static void main(String[] args){
	           int arr[]={9,8,5,4,3,2,1};
	           partion(arr,0,arr.length-1);
	           for(int i=0;i<arr.length;i++)
                                   System.out.print(arr[i]+" ");
	}
	
	public static void partion(int arr[],int i,int j){
	          if(i<j){
		int mid=(i+j)/2;
		partion(arr,i,mid);
		partion(arr,mid+1,j);
		merge(arr,i,mid,j);
	          }
	}
	
	public static void merge(int arr[], int low,int mid, int high){
	         int temp[]=new int[high-low+1];
	         int i=low,j=mid+1,k=0;
	         while(i<=mid && j<=high){
		if(arr[i]<arr[j]) temp[k++]=arr[i++];
		else temp[k++]=arr[j++];
	         }
	         while(i<=mid) temp[k++]=arr[i++];
	         while(j<=high)  temp[k++]=arr[j++];

	         for(i=0;i<temp.length;i++) arr[low+i]=temp[i];
	}
}