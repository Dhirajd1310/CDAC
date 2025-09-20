//Order Number Display 

import java.util.Scanner;

 class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter The Number: ");
        String orderNumber = sc.nextLine();

       
        StringBuilder sb = new StringBuilder(orderNumber);
        sb.reverse();

        System.out.println("Reversed  Number is: " + sb.toString());
        
    }
}
