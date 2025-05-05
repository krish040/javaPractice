public class Thread5 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            // try{
            //     Thread.sleep(2000);
            // }
            // catch(InterruptedException e){
            //     e.printStackTrace();
            // }
            System.out.println(Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) throws InterruptedException{
        System.out.println("start");
        System.out.println(Thread.currentThread().getName());
        Thread t1=new Thread5();
        t1.start();
        System.out.println(t1.getName());
        // t1.setName("1sttt");
        
        
        
        
        
        // Thread t2=new Thread5();
        // t2.start();
        // t2.setName("2ndd");
        // t1.join();
        System.out.println("end");
    }
}
