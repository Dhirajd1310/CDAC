//Bank Account Security

import java.util.Scanner;

class Problem20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account ID: ");
        final int accountId = sc.nextInt(); 

        System.out.println("Account ID = " + accountId + " (cannot be changed)");
    }
}
