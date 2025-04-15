public class RotateNtimes {

    public static void rotate(int a[],int n){
        int temp = 0;
        for(int i = 0; i < n; i++){
            for(int j=0;j<a.length-1;j++){
                temp = a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,};
        int n = 1;
        rotate(arr, n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
