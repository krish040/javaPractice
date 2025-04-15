public class B extends A{
    int a=3;
    public B m1(){
        System.out.println("hello");
        return new B();
    }
    public static void main(String[] args){
        B b=new B();
        b.m1();  //B.m1(); //hello
        System.out.println(b.a);//3

        A a= new A();
        a.m1();//hiii
        System.out.println(a.a);//2
        
        A a1=new B();
        a1.m1();//hello
        System.out.println(a1.a); //2
    }
}
