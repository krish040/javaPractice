public class Thread3 implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<10;i++){
            System.out.println("thred3");
        }
        //throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}
