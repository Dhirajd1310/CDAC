//HashMap (entrySet → key + value)
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionDemo15 {
    public static void main(String[] args) {
        HashMap<String, Object> a = new HashMap<>();
        a.put("Roll No", 123);
        a.put("Name", "Ramm");
        a.put("Fee", 123.56);

        System.out.println(a);

        // get both key and value using entrySet
        Set<Map.Entry<String, Object>> entries = a.entrySet();

        // print key-value pairs
        for (Map.Entry<String, Object> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}