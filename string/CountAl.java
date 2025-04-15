public class CountAl {
    public static void main(String[] args) {
        String s="!@#$%qwer124";

        //count alphabets

        //int countal=0;
        // for(int i=0;i<s.length();i++){
        //     if((s.charAt(i)>='A' && s.charAt(i)<='Z') ||(s.charAt(i)>='a' && s.charAt(i)<='z' )){
        //         countal++;
        //     }
        // }
        // System.out.println(countal);

        //count vowals

        // int countvo=0;
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='E'  || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
        //         countvo++;
        //     }
        // }
        // System.out.println(countvo);

        // count speacial characters
        int countsp=0;
        // for(int i=0;i<s.length();i++){
        //     if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z' ) || (s.charAt(i)>=48 && s.charAt(i)<=57 )){
        //     }
        //     else{
        //         countsp++;
        //     }
        // }

        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                countsp++;
            }
        }
        System.out.println(countsp);

    }
}
