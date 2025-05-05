public class User {
    String name;

    public User(String name, double balacne) {
        this.name = name;
        this.balacne = balacne;
    }

    double balacne=1000;

    public  void  withdraw(double amount){   // instead of making entire method synchronized, we can make the synchronized block only to block the deduct stmt synchronized
        System.out.println("wlcm to atm");
        System.out.println("select option");
        System.out.println("enter pin");
        System.out.println("amount is withdrawing");

        synchronized(this){ //User.class = class level block
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balacne-=amount;
            System.out.println("successful......");

        }
    }

    public double getBalance(){
        return balacne;
    }
}
