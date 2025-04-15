import java.util.ArrayList;
import java.util.Collection;
class Mycoll{
    public static void main(String[] args) {

        Collection c=new ArrayList();

        // System.out.println(c);
        // System.out.println(c.size());
        // System.out.println(c.isEmpty());
        // System.out.println(c.hashCode());

        c.add("Rahul");
        c.add("5");
        c.add("true");

        System.out.println(c);

        
        // System.out.println(c.size());
        // System.out.println(c.isEmpty());
        // System.out.println(c.hashCode()); // 18 digit code
        // System.out.println(c.contains("Rahul"));

        Collection c1=new ArrayList();

        c1.add("56");
        c1.add("5");
        c1.add("ram");
        c1.add(c);
        c1.addAll(c);

        System.out.println(c1.containsAll(c1));
        Collection c2=new ArrayList();
        c2.addAll(c);
        c2.addAll(c1);
        System.out.println(c2);

        Collection c3=new ArrayList();
        c3.addAll(c1);



    }
}