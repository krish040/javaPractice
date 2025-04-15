public class LogicalOr {
    public static void main(String[] args){
        //System.out.println(5%5==0 || 5%7==0);// true
        //WAJP to check leap year or not 
        int year=1900;//1998;//2000;//2004
        //System.out.println((year%4==0 && year%100!=0) || year%400==0);
        char c1='D';
        char c2=84;
        c1++;
        c2++;
        int i=5,j=3,k=7;
        // System.out.println(j--);
        // System.out.println(j);
        int x=10,y=1;
        if(x!=10 && x/0==0)
            System.out.println(y);
        else
            System.out.println("hi");
        //System.out.println(!(5 &gt; x));
        int a,b,c;
        a=b=c=5;
        int exp=a+b++ + ++c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(exp);
    } 
    // every 4th year is leap as 365
    // all century years are not leap years .
    // only every 4th century is leap.

    // leap: 2024,2000,1600
    // not leap: 1900,1998,2100,2200
}
