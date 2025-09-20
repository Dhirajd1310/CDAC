//Remove Outdated Information

import java.util.Scanner;

class Problem17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Text: ");
        String original = sc.nextLine();

        System.out.print("Enter String to  Delete: ");
        String toRemove = sc.nextLine();

        StringBuffer sb = new StringBuffer(original);

        int start = sb.indexOf(toRemove);

        if (start != -1) {
            sb.delete(start, start + toRemove.length());
        }

        System.out.println("Info: " + sb.toString().trim());
    }
}
