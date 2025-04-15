public class Summeven50 {
    public static void main(String[] args) {
        int sum = 0,i=2;
        while (i <= 50) {
            sum+=i;
            i+=2;
        }
        System.out.println(sum);

         // Using the AP formula
         int a = 2;  // First term of the series
         int l = 50; // Last term of the series
         int d = 2; // Difference between consecutive terms

         int n = (l - a) / d + 1; // Number of terms
         int sumFormula = (n * (a + l)) / d; // Sum of the AP
         System.out.println("Sum of even numbers (formula): " + sumFormula);
    }
}
