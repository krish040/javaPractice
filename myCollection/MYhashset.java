import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class MYhashset {
    public static void main(String[] args) {
        HashSet s=new HashSet();

        Integer i=5;
        Integer i1=7;
        s.add(5);
        s.add(7);
        // s.add(null);
        s.add(3);
        // s.add("hi");
        // s.add(true);
        s.add(1);

        System.out.println(s);
        System.out.println(i.hashCode());
        System.out.println(i1.hashCode());



        HashSet s1=new LinkedHashSet();
        s1.add(2);
        s1.add(null);
        s1.add(2);
        s1.add("hi");
        s1.add("bye");

        // System.out.println(s1.hashCode());

        // System.out.println(s1);

        TreeSet s2=new TreeSet();
        s2.add(1);
        s2.add(2);
        s2.add(3);
        // s2.add("hi");
        // s2.add(true);
        // System.out.println(s2);

    }
}
