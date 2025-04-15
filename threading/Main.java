public class Main {
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        t1.start();
        Mythread2 t2=new Mythread2();
        t2.start();
        Thread t3=new Thread(new Thread3());

        t3.start();
    }
}
