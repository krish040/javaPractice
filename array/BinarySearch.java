public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int num=99;
        int index=binarySearch(a,num);
        if(index==-1){
            System.out.println("NOT FOUNDDDDDDDDDDDDD");
        }
        else{
            System.out.println("index:"+index);
        }
    }
    public static int binarySearch(int a[],int num){
        int start=0,end=a.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(a[mid]==num){
                return mid;
            }
            else if(num<a[mid]){
                end=mid-1;
            }
            else if(num>a[mid]){
                start=mid+1;
            }
        }
        return -1; 
    }
}
