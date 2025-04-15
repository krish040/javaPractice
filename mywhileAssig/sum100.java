public class sum100 {
    public static void main(String[] args) {
        int i=1,sum=0;
        while(i<=100){
            sum+=i;
            i++;
        }
        System.out.println("Sum of first 100 natural numbers is "+sum);
        System.out.println("(n* n+1 )/2 ="+(100*101)/2);
    }
}
