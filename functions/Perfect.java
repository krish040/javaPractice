public class Perfect {

    static public boolean checkPerfect(int n){
        int sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }       
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
    }
    
    static public void main(String[] args){
        int n=8128;//1,2,3,6 (1+2+3=6) yes perfect, 28,496,8128
        System.out.println(n+": "+checkPerfect(n));

        // for(int i=1;i<=n;i++){
        //     System.out.println(i+": "+checkPerfect(i));
        // }
    }
}
