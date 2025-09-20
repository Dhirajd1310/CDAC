import java.util.LinkedList;

class RemoveLastOccurrenceExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");
        System.out.println("Original LinkedList : " + list);

        boolean isRemoved = list.removeLastOccurrence("B");
        System.out.println("LinkedList after removing last occurrence of 'B': " + list);
        System.out.println("Was the element removed? " + isRemoved);

        isRemoved = list.removeLastOccurrence("Z");
        System.out.println("LinkedList after removing last occurrence of 'Z': " + list);
        System.out.println("Was the element removed? " + isRemoved);
    }
}
