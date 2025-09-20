import java.util.Set;
import java.util.TreeSet;

public class CollectionDemo11 {
    public static void main(String[] args) {
        // does not allow duplicates and sorted in ascending order
        Set<Number> a = new TreeSet<>();
        a.add(123.65);
        a.add(111.34);
        a.add(1234.678);
        a.add(112.34);

        // ordered data -- sorted -- TreeSet property
        System.out.println(a);
    }
}