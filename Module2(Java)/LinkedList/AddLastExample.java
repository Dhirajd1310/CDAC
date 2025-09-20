import java.util.LinkedList;

class AddLastExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Original LinkedList : " + list);

        list.addLast("D");
        System.out.println("LinkedList after addLast : " + list);
    }
}
