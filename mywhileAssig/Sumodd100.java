public class Sumodd100 {
    public static void main(String[] args) {
        int sum = 0,i=1;
        while(i<=100){
            sum+=i;
            i+=2;
        }
        System.out.println(sum);

         // First term, last term, and common difference
         int a = 1; // First odd number
         int l = 99; // Last odd number
         int d = 2; // Difference between consecutive terms
 
         // Calculate the number of terms (n)
         int n = ((l - a) / d) + 1;
 
         // Use the AP sum formula: S_n = n/2 * (a + l)
         sum = (n * (a + l)) / 2;
 
         // Output the result
         System.out.println("Sum of odd numbers from 1 to 100: " + sum);
    }
}
