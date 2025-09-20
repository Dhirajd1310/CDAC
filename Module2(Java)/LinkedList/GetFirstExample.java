import java.util.LinkedList;

class GetFirstExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("Original LinkedList : " + list);

        String firstElement = list.getFirst();
        System.out.println("First element of the LinkedList : " + firstElement);

        list.addFirst("Start");
        System.out.println("LinkedList after addFirst : " + list);

        String newFirstElement = list.getFirst();
        System.out.println("New first element : " + newFirstElement);
    }
}
