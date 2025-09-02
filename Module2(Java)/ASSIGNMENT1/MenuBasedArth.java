import java.util.Scanner;
class MenuBasedArth{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select operation(1-Addition,2-subtraction:");
		int operation = sc.nextInt();
		
		System.out.println("Enter first number:");
		int num1 = sc.nextInt();
		System.out.println("Enter second number:");
		int num2 = sc.nextInt();
		
		int result=0;
		
		if(operation==1){
			result=num1+num2;
		}else if(operation==2){
			result=num1-num2;
		}else {
			System.out.println("Wrong input.");
		}
		System.out.println("Result="+result);
	}
}

			