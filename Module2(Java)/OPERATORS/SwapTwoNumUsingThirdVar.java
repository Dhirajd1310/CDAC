import java.util.Scanner;
class SwapTwoNum{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Before Swapping:");
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		
		int temp = b;
		b = a ;
		a = temp;
		
		System.out.println("After Swapping :");
		System.out.println("The value of a:"+a);
		System.out.println("The value of b:"+b);
	}
}