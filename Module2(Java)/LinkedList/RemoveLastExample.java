import java.util.LinkedList;

class RemoveLastExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Original LinkedList : " + list);

        String removedElement = list.removeLast();
        System.out.println("LinkedList after removeLast : " + list);
        System.out.println("Removed Element : " + removedElement);

        removedElement = list.removeLast();
        System.out.println("LinkedList after another removeLast : " + list);
        System.out.println("Removed Element : " + removedElement);
    }
}
