public class Bubble {

    public static void bubbleSort(int a[]){
        int n=a.length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n-i-1 ; j++){
                if(a[j]<a[j+1])
                    swap(a,j);
            }
        }
    }

    public static void swap(int a[],int j){
        int temp=a[j];
        a[j]=a[j+1];
        a[j+1]=temp;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};//{5,4,3,2,1};
        bubbleSort(a);

        // print the sorted array
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
