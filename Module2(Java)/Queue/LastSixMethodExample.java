import java.util.*;

class LastSixMethodExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        // Adding elements to the deque
        for (int i = 10; i <= 100; i += 10) {
            dq.add(i);
        }

        dq.addFirst(10);  // Adds another 10 at the front
        dq.addLast(70);   // Adds another 70 at the end

        System.out.println(dq);  // Prints the full deque

      // Accessing first and last elements without removal
        System.out.println(dq.getFirst());     // Throws exception if deque is empty
        System.out.println(dq.getLast());      // Throws exception if deque is empty

        System.out.println(dq.peekFirst());    // Returns null if empty
        System.out.println(dq.peekLast());     // Returns null if empty

        // Removes the first occurrence of 10
        System.out.println(dq.removeFirstOccurrence(10));
        System.out.println(dq);

        // Removes the last occurrence of 70
        System.out.println(dq.removeLastOccurrence(70));
        System.out.println(dq);
		
    }
}
