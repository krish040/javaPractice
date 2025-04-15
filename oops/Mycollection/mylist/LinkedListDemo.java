import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        // Creating LinkedList
        LinkedList<String> list = new LinkedList<>();

        // add() - Adds element to the end
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial list: " + list);

        // addFirst() - Adds at the beginning
        list.addFirst("Mango");
        System.out.println("After addFirst: " + list);

        // addLast() - Adds at the end
        list.addLast("Orange");
        System.out.println("After addLast: " + list);

        // add(index, element) - Inserts at specified position
        list.add(2, "Grapes");
        System.out.println("After add(2, \"Grapes\"): " + list);

        // get(index) - Gets element at index
        System.out.println("Element at index 3: " + list.get(3));

        // getFirst() and getLast()
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // set(index, element) - Replaces element at index
        list.set(1, "Strawberry");
        System.out.println("After set(1, \"Strawberry\"): " + list);

        // contains(element)
        System.out.println("Contains 'Banana'? " + list.contains("Banana"));

        // indexOf(element)
        System.out.println("Index of 'Cherry': " + list.indexOf("Cherry"));

        // lastIndexOf(element)
        list.add("Cherry"); // Add duplicate
        System.out.println("After adding duplicate 'Cherry': " + list);
        System.out.println("Last index of 'Cherry': " + list.lastIndexOf("Cherry"));

        // remove() - removes and returns first element
        System.out.println("Removed element: " + list.remove());
        System.out.println("After remove(): " + list);

        // remove(index)
        list.remove(2);
        System.out.println("After remove(2): " + list);

        // remove(Object)
        list.remove("Orange");
        System.out.println("After remove(\"Orange\"): " + list);

        // removeFirst() and removeLast()
        list.removeFirst();
        list.removeLast();
        System.out.println("After removeFirst() and removeLast(): " + list);

        // peek(), peekFirst(), peekLast()
        System.out.println("Peek: " + list.peek());
        System.out.println("Peek First: " + list.peekFirst());
        System.out.println("Peek Last: " + list.peekLast());

        // poll(), pollFirst(), pollLast()
        System.out.println("Poll: " + list.poll()); //Removes and returns the first element of the list.
        System.out.println("Poll First: " + list.pollFirst()); //Removes and returns the first element of the list.
        System.out.println("Poll Last: " + list.pollLast()); //Removes and returns the last element of the list.

        // push() - same as addFirst()
        list.push("Kiwi");
        System.out.println("After push(\"Kiwi\"): " + list);

        // pop() - removes first element
        System.out.println("Popped element: " + list.pop());
        System.out.println("After pop(): " + list);

        // isEmpty()
        System.out.println("Is list empty? " + list.isEmpty());

        // size()
        list.add("Pineapple");
        list.add("Blueberry");
        System.out.println("List size: " + list.size());

        // clear()
        list.clear();
        System.out.println("After clear(): " + list);
        System.out.println("Is list empty after clear()? " + list.isEmpty());
    }
}
