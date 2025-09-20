import java.util.*;

class QueueMethods {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();

        // Adding elements to the queue
        for (int i = 10; i <= 100; i += 10) {
            queue.add(i);
        }

        System.out.println(queue);
        System.out.println();

       // Using add() method
        System.out.println(queue.add(110));
        System.out.println(queue);

        // Using offer() method
        System.out.println(queue.offer(110));
        System.out.println(queue);
        System.out.println();

     // Using remove() method (removes head)
        System.out.println(queue.remove());
        System.out.println(queue);

       // Using poll() method (removes head)
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println();

        // Using element() method (retrieves head)
        System.out.println(queue.element());
        System.out.println(queue);

        // Using peek() method (retrieves head)
        System.out.println(queue.peek());
        System.out.println(queue);
	
    }
}
