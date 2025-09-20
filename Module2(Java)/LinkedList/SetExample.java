import java.util.LinkedList;

class SetExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println("Original LinkedList : " + list);

        String oldElement = list.set(2, "X");
        System.out.println("LinkedList after set operation : " + list);
        System.out.println("Replaced element : " + oldElement);

        oldElement = list.set(0, "Start");
        System.out.println("LinkedList after set operation at index 0 : " + list);
        System.out.println("Replaced element : " + oldElement);
    }
}
