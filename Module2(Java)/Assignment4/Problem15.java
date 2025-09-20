//Meeting Notification

import java.util.Scanner;

class Problem15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Text: ");
        String baseText = sc.nextLine();

        System.out.print("Enter Details : ");
        String details = sc.nextLine();

        StringBuffer sb = new StringBuffer(baseText);
        sb.append(" ").append(details);

        System.out.println("Complete Notification: " + sb.toString());

    }
}
