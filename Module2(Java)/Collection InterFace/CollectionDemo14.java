import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class CollectionDemo14 {
    public static void main(String[] args) {
        HashMap<String, Object> a = new HashMap<>();
        a.put("Roll No", 123);
        a.put("Name", "Ramm");
        a.put("Fee", 123.56);

        System.out.println(a);

        // only values, not keys
        Collection<Object> col = a.values();
        Iterator<Object> it = col.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}