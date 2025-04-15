public class User {

    private String username;
    private int userid;
    private long phno;
    private String pwd;

    User(String username,int userid,long phno,String pwd){
        this.username=username;
        this.userid=userid;
        this.phno=phno;
        this.pwd=pwd;
    }

    public String getUsername(){
        return username;
    }

    public void setUsername(String username){
        this.username=username;
    }
    
    public static void main(String[] args) {
        User u=new User("xyz",101,8654234589l,"qwe123");

        System.out.println(u.username);
        System.out.println(u.userid);
        System.out.println(u.phno);
        System.out.println(u.pwd);
    }
}
