import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Mymap {
    public static void main(String[] args) {

        Map m=new HashMap();

        m.put(1,"k");
        m.put("k","3");
        m.put("hi","bye");
        // System.out.println(m);

        Map m1=new HashMap();


        m1.putAll(m);
        m1.put(true,6);

        // System.out.println(m1.values());
        // System.out.println(m1.keySet());
        // System.out.println(m1.entrySet());
        // System.out.println(m1.size());
        // System.out.println(m1.isEmpty());


        Map m2=new LinkedHashMap();

        m2.put(1,"k");
        m2.put("k","3");
        m2.put("hi","bye");
        
        // System.out.println(m2);
        m1.putAll(m2);
        // System.out.println(m1);
        

        // Map m3=new LinkedHashMap();

        // m3.putAll(m2);
        // m3.put(true,6);

        // System.out.println(m3);


        // System.out.println(m3.values());
        // System.out.println(m3.keySet());
        // System.out.println(m3.entrySet());
        // System.out.println(m3.size());
        // System.out.println(m3.isEmpty());

        // Map m4=new LinkedHashMap();



        NavigableMap nm1=new TreeMap();
        nm1.put(1,2);
        nm1.put(1,2);
        nm1.put(2,3);

        // System.out.println(nm1); 

        Map nm2=new TreeMap();
        nm2.put(4,6);
        
        
        nm2.putAll(nm1);
        // System.out.println(nm2);

        Map ht=new Hashtable(); 
        
        ht.put(1,2);
        ht.put(1,2);
        ht.put(2,3);
        System.out.println(ht);

        

        









    }
}
