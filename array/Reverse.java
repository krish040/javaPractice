public class Reverse {

    public static void reverse(int a[]){
        int i=0,j=a.length-1,temp;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    public static void reverse1sthalf(int a[]){
        int size=a.length/2-1;
        int i=0,j=size,temp;
        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
    }

    public static void reverseOddIndex(int a[]){
        //int size=a.length-1;
        int i=1,temp,j;
        if(a.length%2==0)
            j=a.length-1;
        else j=a.length-2;

        while(i<j){
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i=i+2;
            j=j-2;
        }
    }


    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8};
        reverseOddIndex(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
