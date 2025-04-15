public class InsertionSort{
	public static void main(String[] args){
		int arr[]={1,5,2,7,3};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements of arr[0..i-1] that are greater than key
            // one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j]; // shift
                j--;
            }
            arr[j + 1] = key;
        }
		
		//print
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
}