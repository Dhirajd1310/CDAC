import java.util.LinkedList;

class RemoveFirstExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Original LinkedList : " + list);

        String removedElement = list.removeFirst();
        System.out.println("LinkedList after removeFirst : " + list);
        System.out.println("Removed Element : " + removedElement);

        removedElement = list.removeFirst();
        System.out.println("LinkedList after another removeFirst : " + list);
        System.out.println("Removed Element : " + removedElement);
    }
}
