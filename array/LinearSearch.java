class LinearSearch{

    public static int linearSearch(int a[],int k){
        for(int i=0;i<a.length;i++){
            if(a[i]==k){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {

        int a[]={11,22,33,44,55};
        int element=55;
        
        int index=linearSearch(a,element);

        if(index==-1)
            System.out.println("element not found");
        else
            System.out.println("index:"+index);
    }
}