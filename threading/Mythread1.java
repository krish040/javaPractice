public class Mythread1 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("tread1");
        }
    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        for(int i=0;i<20;i++){
            System.out.println("tread2");
        }
    }
}

