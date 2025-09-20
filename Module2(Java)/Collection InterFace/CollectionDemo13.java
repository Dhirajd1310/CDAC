import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo13 {
    public static void main(String[] args) {
        HashMap<String, Object> a = new HashMap<>();
        a.put("Roll No", 123);
        a.put("Name", "Ramm");
        a.put("Fee", 123.56);
        a.put(" ", 123.11);
        a.put("Roll No", 555); // override
        a.put(" ", 123);       // only one empty key allowed
         a.put(" ", 143.66);
        System.out.println(a);

        // get specific value
        Object obj = a.get("Fee");
        System.out.println(obj);

        // print only keys
        Set<String> keys = a.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
		
    }
}