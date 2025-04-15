public class Driver {
    public static void main(String[] args) {
        User u= new User("xyz",101,8654234589l,"qwe123");
        System.out.println(u.getUsername());
        u.setUsername("abc");
        System.out.println(u.getUsername());

    }
}
