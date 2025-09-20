import java.util.Scanner;

class Problem11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a text: ");
        String original = sc.nextLine();
		
        System.out.print("Enter a text you have to find: ");
        String toFind = sc.nextLine();

        System.out.print("Enter the replacement Text: ");
        String replacement = sc.nextLine();
		
        StringBuilder sb = new StringBuilder(original);
		
        int start = sb.indexOf(toFind);
        if (start != -1) {
            int end = start + toFind.length();
            sb.replace(start, end, replacement);
        } else {
            System.out.println("Text to find not found!");
            return;
        }

        System.out.println("Updated Message:");
        System.out.println(sb.toString());
    }
}
