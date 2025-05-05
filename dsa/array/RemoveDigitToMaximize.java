public class RemoveDigitToMaximize {

    public static String removeDigit(String number, char digit) {
        String maxResult = "";
        
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                // Create new string without the i-th occurrence of digit
                String candidate = number.substring(0, i) + number.substring(i + 1);
                // Update maxResult if this candidate is larger
                if (candidate.compareTo(maxResult) > 0) {
                    maxResult = candidate;
                }
            }
        }
        
        return maxResult;
    }

    public static void main(String[] args) {
        System.out.println(removeDigit("123", '3'));    // Output: "12"
        System.out.println(removeDigit("1231", '1'));   // Output: "231"
        System.out.println(removeDigit("551", '5'));    // Output: "51"
    }
}
/*
 *  Valid: 
 *  0 ≤ beginIndex ≤ endIndex ≤ s.length()
 * 
 *  Errors: 
 *  beginIndex < 0
 *  endIndex > s.length() 
 *  beginIndex > endIndex
 */
