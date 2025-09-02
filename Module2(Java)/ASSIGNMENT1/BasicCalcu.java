import java.util.Scanner;
class BasicCalcu{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a First number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a Second number:");
		int num2 = sc.nextInt();
		
		System.out.println("Select one opeartor you to do calculation(+,-,*,/)");
		char op = sc.next().charAt(0);
		
		double result=0;
		
		if (op == '+') {
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if (op == '-') {
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if (op == '*') {
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if (op == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid operator!");
        }
	}
}

		