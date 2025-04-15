public class Tech {

    public static int count(int num){
        int count=0,n=num;
        while(n!=0){
            n=n/10;
            count++;
        }
        return count;
    }
    public static boolean isTech(int num){
        int count=count(num);
        if(count%2!=0) return false;
        else {
            //split()
            int secondHalf=0,firstHalf=num,rem=0;
            for(int i=1;i<=count/2;i++){
                rem=firstHalf%10;
                secondHalf=secondHalf*10+rem;
                firstHalf/=10;
            }
            // we get reversed second half and we do not want it to be reversed
            //System.out.println("secondHalf :"+secondHalf);//52
            int rev = 0;
            while (secondHalf > 0) {
                rev = rev * 10 + (secondHalf % 10);
                secondHalf /= 10;
            }
            secondHalf=rev;     //System.out.println("secondHalf :"+secondHalf);
            //System.out.println("firstHalf :"+firstHalf);

            int sum=firstHalf+secondHalf;
            return (sum * sum == num);
        }
        //System.out.println("count:"+count);
    }



    public static boolean isTechNumber(int num) {
        String strNum = Integer.toString(num); //Integer= class , primitive to non primitve = parsing
        int length = strNum.length();

        // Tech number must have an even number of digits
        if (length % 2 != 0) return false;

        int mid = length / 2;
        int firstHalf = Integer.parseInt(strNum.substring(0, mid));
        int secondHalf = Integer.parseInt(strNum.substring(mid));

        int sum = firstHalf + secondHalf;
        return (sum * sum == num);
    }

    public static void main(String[] args) {
        System.out.println(isTech(2025)); // true
        System.out.println(isTechNumber(2025)); //2025
    }
}
