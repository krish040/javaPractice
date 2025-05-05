public class RotateImage{
    public static void rotateArrayBy90(int arr[][]){
        //transpose // reverse
        // in place transpose only for square matrix
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        System.out.println("transpose done");
        
        
        //reverse
        for(int []i:arr){
            reverse(i);
            System.out.println("reverse done");
        }
    }

    public static void reverse(int []arr){

        int i=0,j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        rotateArrayBy90(arr);
        
        //print rotated array
        for(int i[]:arr){
            for(int j:i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void tufReverseArray(int matrix[][]){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length - 1 - j];
                matrix[i][matrix.length - 1 - j] = temp;
            }
        }
    }
}