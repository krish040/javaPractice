public class FibonacciRange {

    public static void range(int lower,int upper){
        int first=0,second=1,next=0;
        if(lower==1){
            System.out.print(first+" "+second+" ");
        }
        if(lower==2){
            System.out.print(second+" ");
        }
        for(int i=lower;i<=upper;i++){
            if(next>=lower && next<=upper){
                System.out.print(next+" ");
            }
            next=first+second;
            first=second;
            second=next;
        }
    }

    public static int nthfib(int n){
        if(n==0)    return 0;
        if(n==1)    return 1;
            
        int count=1,first=0,second=1,next=0;
        while(count<n){
            next=first+second;
            first=second;
            second=next;
            count++;
        }
        return next;
    }

    public static void main(String[] args) {
        range(1, 10);
        // System.out.println(nthfib(7));
    }  
}
// 0 1 1 2 3 5 8 13
