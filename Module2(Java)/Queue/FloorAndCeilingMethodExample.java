import java.util.*;

class FloorAndCeilingMethodExample {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<Integer>();

        // Adding elements to the TreeSet
        for (int i = 10; i <= 100; i += 10) {
            set.add(i);
        }

        System.out.println(set); // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // ceiling(x): Smallest element >= x
        System.out.println(set.ceiling(52)); // 60
        System.out.println(set.ceiling(55)); // 60
        System.out.println(set.ceiling(57)); // 60

       /* // floor(x): Greatest element <= x
        System.out.println(set.floor(52));   // 50
        System.out.println(set.floor(55));   // 50
        System.out.println(set.floor(57));   // 50*/
    }
}
