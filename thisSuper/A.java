public class A extends Parent{
    A(){
        this(5);
        System.out.println("child constructor");
    }
    A(int a){
        super();

        System.out.println("a:"+a);
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        new A();
    }

    public void m1(){
    }
}