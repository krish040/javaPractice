class Deepak extends Thread{
    @Override
    public  void run(){
        synchronized(this){
            for(int i=0;i<10;i++){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Thread d=new Deepak();
        d.start();

        Thread d1=new Deepak();
        d1.start();


    }
}