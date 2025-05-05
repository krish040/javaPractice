public class Bank{
    public static void main(String[] args) throws InterruptedException {

        User mansi=new User("mansi", 1000);

        Thread t1=new Thread(()->{
            mansi.withdraw(500);
        });

        Thread t2=new Thread(()->{
            mansi.withdraw(500);
        });

        Thread t3=new Thread(()->{
            mansi.withdraw(500);
        });



        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("avalable balance: "+mansi.getBalance());
    }
}