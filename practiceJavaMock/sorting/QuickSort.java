public class QuickSort{
	public static void main(String [] args){
		int arr[]={8,9,9,5,4,8,3,2,2,1};
		qs(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++){
		        System.out.print(arr[i]+" ");
		}
	}
	
	public static void qs(int arr[],int low,int high){
		if(low<high){
		        int pindex=pivotIndex(arr,low,high);
		        qs(arr,low,pindex-1);
		        qs(arr,pindex+1,high);
		}
	}
	
	public static int pivotIndex(int arr[],int low,int high){
		int i=low,j=high;
		int pivot=arr[low];
		while(i<j){
		      while(i<=high-1 && arr[i]<=pivot) i++;
		      while(j>low && arr[j]>pivot) j--;
		      if(i<j) swap(arr,i,j);
		}
		swap(arr,low,j); //swapping j with pivot
		
		return j;
	}
	
	public static void swap(int arr[],int i,int j){
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
