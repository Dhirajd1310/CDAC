//Room Allocation Update

import java.util.Scanner;

class Problem16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Room Number: ");
        String room = sc.nextLine();

        System.out.print("Enter Building : ");
        String building = sc.nextLine();

        System.out.print("Enter Index: ");
        int index = sc.nextInt();

        StringBuffer sb = new StringBuffer(room);
        sb.insert(index, building + " ");

        System.out.println(" Allocated room: " + sb.toString());

    }
}
