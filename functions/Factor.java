public class Factor {
    public static int factor(int n){
        int count=0;
        for(int i=1;i*i<=n;i++){ // if you are doing i<=n/2 then only use 1st if condition 
                                    //but aso print the number itself as if =36 then it will 
                                    //fo upto 18 and (as 36 is a factor a 36 so we also have to print it manually )
            if(n%i==0){
                System.out.print(i+", ");
                count++;
                if(n/i!=i){
                    System.out.print(n/i+", ");
                    count++;
                }
            }
        }
        System.out.println();
        return count;            
    }
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            System.out.print("factors of "+i+": ");
            System.out.println("count: "+factor(i)); 
        }
        
    }
}
