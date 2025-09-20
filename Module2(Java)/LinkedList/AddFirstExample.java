import java.util.LinkedList;

class AddFirstExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Original LinkedList : " + list);

        list.addFirst("A");
        System.out.println("LinkedList after addFirst : " + list);
    }
}
