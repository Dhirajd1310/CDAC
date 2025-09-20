import java.util.Scanner;

class UserArithmeticException extends RuntimeException {
    UserArithmeticException(String desc) {
        super(desc); 
    }
}
class CustomException{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operator: ");
        char ch = sc.next().charAt(0);

        if (ch != '/') {
            System.out.println("Other than divide operation will be performed.");
           
        } else {
            if (num2 == 0) {
                throw new UserArithmeticException("Number is zero, cannot be divided.");
            } else {
                System.out.println("Result: " + (num1 / num2));
            }
        }
    }
}