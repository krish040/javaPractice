public class ZigZag {

    public static int[] merge(int a[],int b[]){
        int n1=a.length,n2=b.length;
        int c[]=new int [n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            c[k++]=a[i++];
            c[k++]=b[j++];
        }
        while(i<n1){
            c[k++]=a[i++];
        }
        while(j<n2){
            c[k++]=b[j++];
        }
        return c;
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={7,8,9};
        int c[]=merge(a,b);
        for(int i=0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }
    }
    
}
