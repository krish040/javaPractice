public class MaxElement {
    public static void main(String[] args) {
        int a[]={-8,-3,-6,-5};//{5,4,3,2,1};//{1,2,3,4,5};//
        int max=a[0],semax=a[0]; // Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                semax=max;
                max=a[i];
            }
            else if(a[i]<max && a[i]>semax){
                semax=a[i];
            } 
        }
        System.out.println("max:"+max+" semax :"+semax);
    }
}
