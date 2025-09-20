import java.util.LinkedList;

class GetLastExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Original LinkedList : " + list);

        String lastElement = list.getLast();
        System.out.println("Last element of the LinkedList : " + lastElement);

        list.addLast("D");
        System.out.println("LinkedList after addLast : " + list);

        String newLastElement = list.getLast();
        System.out.println("New last element : " + newLastElement);
    }
}
