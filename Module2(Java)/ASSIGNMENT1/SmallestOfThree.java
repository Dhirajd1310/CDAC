import java.util.Scanner;
class SmallestOfThree{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The First Number:");
		int num1 = sc.nextInt();
		
		System.out.println("Enter The Second Number:");
		int num2 = sc.nextInt();
		
		System.out.println("Enter The Third Number:");
		int num3 = sc.nextInt();
		
		int op = (num1>num2)?(num2>num3?num3:num2):(num1<num3?num1:num3);
		
		System.out.println("The Smallest Number is:"+op);
		}
	}