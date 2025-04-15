public class ZerosToLeft {
    public static void main(String[] args) {
        // int[] a = {1, 2, 0, 4, 0,7,0,1,0,0,0,0};
        //int[] a = {0, 1, 2, 3, 4, 0, 5, 0, 6}; // my logic changes the order for non zero elements

        // int i=0,index=0;
        // while(i<a.length){
        //     if(a[i]==0){
        //         a[i]=a[index];
        //         a[index]=0;
        //         index++;
        //     }
        //     i++;
        // }


        //sir's logic

        // int b[]=new int [a.length];
        // int j=0;
        // for(int i=0;i<a.length;i++){
        //     if(a[i]!=0){
        //         b[j]=a[i];
        //         j++;
        //     }
        // }

        // sir's optimal approach

        // int a[]={5,0,4,3,0,2,0,1};
        // int z=-1;
        // for(int i=0;i<a.length;i++){
        //     if(a[i]==0){
        //         z=i;
        //         break;
        //     }
        // }
        // if(z>0){
        //     for(int j=z+1;j<a.length;j++){
        //         if(a[j]!=0){
        //             int temp=a[j];
        //             a[j]=a[z];
        //             a[z]=temp;
        //             z++;
        //         }
        //     }
        // }

        //print the array
        // for(int i=0;i<a.length;i++){
        //     System.out.print(a[i]+" ");
        // }
    }
}
