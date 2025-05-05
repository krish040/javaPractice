public class Thread6 implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        System.out.println("start");
        System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread(new Thread6());
        t1.start();
        System.out.println("end");
    }
    
}
