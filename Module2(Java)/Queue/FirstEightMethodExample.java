import java.util.*;

class FirstEightMethodExample {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<Integer>();

        // Adding elements to the front and rear
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(40);
        dq.addLast(30);
        System.out.println(dq); // [20, 10, 40, 30]

        // Offering elements to the front and rear
        System.out.println(dq.offerFirst(5));   // true
        System.out.println(dq.offerLast(45));   // true
        System.out.println(dq); // [5, 20, 10, 40, 30, 45]

        // Removing elements from front and rear
        System.out.println(dq.removeFirst());   // 5
        System.out.println(dq); // [20, 10, 40, 30, 45]

        System.out.println(dq.removeLast());    // 45
        System.out.println(dq); // [20, 10, 40, 30]

        // Polling elements (safe removal)
        System.out.println(dq.pollFirst());     // 20
        System.out.println(dq); // [10, 40, 30]

        System.out.println(dq.pollFirst());     // 10
        System.out.println(dq); // [40, 30]
		
    }
}
