import java.util.Scanner;
class ArmsStrongNum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a Number:");
		int num = sc.nextInt();
		
		int a = num/100;
		int b = (num /10)%10;
		int c = num%10;
		
		int sum = (a*a*a)+(b*b*b)+(c*c*c);
		
		if (sum == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
	}
}