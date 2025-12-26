import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    private static List<Integer> numbers = new ArrayList<>();
    private static Random random = new Random();

    private static void inc(int number) {
        synchronized (numbers) {
            numbers.add(number);
            System.out.println(Thread.currentThread().getName() + " added: " + number + ", size: " + numbers.size());
            }
        try {
            Thread.sleep(10); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void dec() {
        synchronized (numbers) {
            if (!numbers.isEmpty()) {
                int number = numbers.remove(numbers.size() - 1);
                System.out.println(Thread.currentThread().getName() + " removed: " + number + ", size: " + numbers.size());
            }
        }
        try {
            Thread.sleep(10); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {
        Runnable inc = () -> {
            for (int i = 0; i < 1000; i++) {
                inc(random.nextInt(100)); 
            }
        };
        Runnable decTask = () -> {
            for (int i = 0; i < 1000; i++) {
                dec();
            }
        };
        Runnable show = () -> {
            for (int i = 0; i < 1000; i++) {
                inc(5);
            }
        };
        new Thread(show).start();
        new Thread(inc).start();
        new Thread(decTask).start();

    }
}