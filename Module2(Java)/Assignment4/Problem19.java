//Message Update System

import java.util.Scanner;

class Problem19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  The Original Text: ");
        String original = sc.nextLine();

        System.out.print("Enter Text to Find: ");
        String toFind = sc.nextLine();

        System.out.print("Enter Replacement Text: ");
        String replacement = sc.nextLine();

        StringBuffer sb = new StringBuffer(original);

        int start = sb.indexOf(toFind);

        if (start != -1) {
            sb.replace(start, start + toFind.length(), replacement);
        }

        System.out.println("Updated Message: " + sb.toString());
    }
}
