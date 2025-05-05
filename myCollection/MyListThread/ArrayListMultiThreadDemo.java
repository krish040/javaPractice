import java.util.ArrayList;
import java.util.List;

public class ArrayListMultiThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();

        // Thread to add elements
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                list.add(i);
            }
        });

        // Thread to read elements
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                if (i < list.size()) {
                    System.out.println("Reading: " + list.get(i));
                }
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Final size: " + list.size());
    }
}
