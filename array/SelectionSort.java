public class SelectionSort {
    public static void main(String[] args) {
        int a[]={3,4,2,1,5};
        for(int i=0;i<a.length;i++){
            int min_index=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            swap(a,i,min_index);
        }

        //print the array
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void swap(int a[],int i,int min_index){
        int temp=a[i];
        a[i]=a[min_index];
        a[min_index]=temp;
    }
}
