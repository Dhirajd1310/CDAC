import java.util.*;

class MethodsExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);
        TreeSet<Integer> set = new TreeSet<>(list);

        // Accessing elements
        System.out.println(set.first());       // Smallest element (10)
        System.out.println(set.last());        // Largest element (90)

        // Polling (retrieves and removes)
        System.out.println(set.pollFirst());   // Removes and returns 10
        System.out.println(set.pollLast());    // Removes and returns 90

        // Navigating through the set
        System.out.println(set.higher(40));    // Next higher than 40 → 50
        System.out.println(set.lower(30));     // Next lower than 30 → 20

        // Final state of the TreeSet
        System.out.println(set);               // [20, 30, 40, 50, 60, 70, 80]
    }
}
