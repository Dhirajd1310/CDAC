import java.util.LinkedList;

class RemoveExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Original LinkedList : " + list);

        String removedElement = list.remove(1);
        System.out.println("LinkedList after removing element at index 1 : " + list);
        System.out.println("Removed Element : " + removedElement);

        removedElement = list.remove(2);
        System.out.println("LinkedList after removing element at index 2 : " + list);
        System.out.println("Removed Element : " + removedElement);
    }
}
