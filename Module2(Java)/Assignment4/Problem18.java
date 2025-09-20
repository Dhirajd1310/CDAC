//Ticket Number Verification

import java.util.Scanner;

class Problem18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter  The Ticket Number: ");
        String ticket = sc.nextLine();

        StringBuffer sb = new StringBuffer(ticket);
        sb.reverse();

        System.out.println("Verification Code: " + sb.toString());

    }
}
