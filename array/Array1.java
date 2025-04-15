public class Array1{
    public static void main(String[] args) {
        // char a[];
        // a = new char[8];
        // System.out.println("hello");
        // System.out.println(a); // hashcode (address in heap memory in string format)
        // System.out.println(a[0]);
        char[] a=new char[8];
        //a={65,1,2,3,4,5,6,7};
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);
        a[0]=0;
        a[1]=1;
        a[2]=2;
        a[3]=3;
        a[4]=4;
        a[5]=5;
        a[6]=6;
        a[7]=7;
        //System.out.print(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

        // System.out.println("reverse");
        // for(int i=a.length-1;i>=0;i--){
        //     System.out.println(a[i]);
        // }

        // double b[]=new double[5];
        // b[0]=2.1;
        // b[1]=2.2;
        // b[3]=2.3;
        // b[4]=2.4;
        // System.out.println(b[0]);
        // System.out.println(b[1]);
    }
}