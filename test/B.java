import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class B{
 public static void main(String[] args) {
    
 

List<String> li = new ArrayList<>();
li.add("Hello");
li.add("Madam");

ListIterator<String> i = li.listIterator();
while (i.hasNext()) {
    i.add("Hi");  // Safe: adds "Hi" before the next element
    i.next();     // Move to next element
    // li.add("Hll"); <-- ❌ remove this line
}
System.out.println(li);
}
}