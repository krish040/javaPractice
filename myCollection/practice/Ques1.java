// import java.util.TreeMap;
import java.util.HashMap;
import java.util.Map;

class Ques1{
    public static void main(String[] args) { 

     HashMap<Integer, String> m = new HashMap<>();
        m.put(1,"apple");
        m.put(20,"banana");
        m.put(39,"cherry");
        m.put(4,"apple");
        m.put(78,"banana");
        m.put(6,"cherry");
        m.put(null,"watermelon");
        
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            if(entry.getKey()==null)
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}