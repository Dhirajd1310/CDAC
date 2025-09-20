import java.util.LinkedList;

class AddExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("D");
        System.out.println("Original LinkedList : " + list);

        list.add(2, "C");
        System.out.println("LinkedList after adding 'C' at index 2 : " + list);

        list.add(0, "Start");
        System.out.println("LinkedList after adding 'Start' at index 0 : " + list);

        list.add(5, "End");
        System.out.println("LinkedList after adding 'End' at index 5 : " + list);
    }
}
