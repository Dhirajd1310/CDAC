//HashSet (no duplicates, no order)
import java.util.HashSet;
import java.util.Set;

public class CollectionDemo10 {
    public static void main(String[] args) {
        // does not allow duplicates and does not allow order
        Set<Object> a = new HashSet<>();
        a.add(123);
        a.add("Rama");
        a.add(1234.678);
        a.add("Rama"); // duplicate will be ignored

        System.out.println(a);
    }
}