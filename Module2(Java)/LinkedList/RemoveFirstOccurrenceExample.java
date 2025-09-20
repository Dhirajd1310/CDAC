import java.util.LinkedList;

class RemoveFirstOccurrenceExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("B");
        System.out.println("Original LinkedList : " + list);

        boolean isRemoved = list.removeFirstOccurrence("B");//true or false
        System.out.println("LinkedList after removing first occurrence of 'B': " + list);
        System.out.println("Was the element removed? " + isRemoved);

        isRemoved = list.removeFirstOccurrence("Z");
        System.out.println("LinkedList after removing first occurrence of 'Z': " + list);
        System.out.println("Was the element removed? " + isRemoved);
    }
}
