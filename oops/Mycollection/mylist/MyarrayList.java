import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
// import java.util.LinkedList;
// import java.util.Vector;

// import javax.swing.text.html.HTMLDocument.Iterator;

class MyarrayList {
    public static void main(String[] args) {
        ArrayList names=new ArrayList();
        names.add(1);
        names.add(true);
        names.add("hi");
        names.add(45.4);
        names.add('S');
        names.add(true);
        System.out.println(names);

        

        // 1. Creating an ArrayList
        // ArrayList<String> names = new ArrayList<>();

        // 2. Adding elements
        // System.out.println(names.add("Alice"));
        // names.add("Bob");
        // names.add("Charlie");
        // names.add("David");
        // names.add("Alice"); // Duplicate entry

        System.out.println("ArrayList after adding elements: " + names);

        // 3. Getting elements by index
        System.out.println("Element at index 2: " + names.get(2));

        // 4. Modifying an element
        names.set(1, "Bobby");
        System.out.println("After modifying index 1: " + names);

        // 5. Removing an element by index
        names.remove(3);
        System.out.println("After removing index 3: " + names);

        // 6. Removing an element by value
        names.remove("Alice");
        System.out.println("After removing 'Alice': " + names);

        // 7. Checking if an element exists
        System.out.println("Contains 'Charlie'? " + names.contains("Charlie"));

        // 8. Finding index of an element
        System.out.println("Index of 'Bobby': " + names.indexOf("Bobby"));
        names.add("Alice"); // Duplicate entry
        System.out.println("Last index of 'Alice': " + names.lastIndexOf("Alice"));

        // 9. Iterating using forEach loop
        System.out.print("Iterating using forEach: ");
        for (Object name : names) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 10. Iterating using Iterator
        System.out.print("Iterating using Iterator: ");
        Iterator iterator = names.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 11. Getting size
        System.out.println("Size of ArrayList: " + names.size());

        // 12. Sorting the ArrayList
        // Collections.sort(names);
        System.out.println("After sorting: " + names);

        // 13. Converting to an array
        Object[] nameArray = names.toArray();
        System.out.print("Converted to array: ");
        for (Object name : nameArray) {
            System.out.print(name + " ");
        }
        System.out.println();

        // 14. Checking if empty
        System.out.println("Is ArrayList empty? " + names.isEmpty());

        // 15. Clearing the ArrayList
        names.clear();
        System.out.println("After clearing: " + names);
        System.out.println("Is ArrayList empty now? " + names.isEmpty());
        
        
    }
}