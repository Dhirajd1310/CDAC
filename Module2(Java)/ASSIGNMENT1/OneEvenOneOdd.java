import java.util.Scanner;

class OneEvenOneOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
		
		if(num1%2==0 && num2%2==0){
			System.out.println("Both Number is Even.");
		} else if (num1%2!=0 && num2%2!=0){
			System.out.println("Both Number is odd.");
		} else {
			System.out.println("Both Number are different(one even one odd");
		}
	}
}
