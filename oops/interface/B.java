public class B implements A{

    // final static int a =9; // final variable must be initialized
    // static {a=10;}
    public static void main(String[] args) {
        //A.m2(); cte
        // a=20;
        // System.out.println(a);
        B b= new B();
        b.m1();
        b.m2();
        System.out.println(A.a);
        System.out.println(A.b);
        A.m3();
        String s[]={"hi"};
        A.main(s);
    }

    @Override
    public void m1() {
        System.out.println("overiding abstract method in class");

    }    

    @Override
    public void m2(){
        System.out.println("overiding default non static method in class");
    }
}
