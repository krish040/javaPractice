public class SurenderSirMyPattern {

    public static void pattern(int row) {
        int count=1;
        char ch;
        System.out.println("$");


        for(int i=2;i<=row;i++){
            if(count<=2)
            ch='#';
            else{
                ch='$';
                if(count==5){
                    count=1;
                    ch='#';
                    // if(ch=='#') ch='$';
                    // else ch='#';
                }
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
                if(ch=='#')ch='$';
                else ch='#';
            }
            count++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int row=6;
        pattern(row);
    }
}
