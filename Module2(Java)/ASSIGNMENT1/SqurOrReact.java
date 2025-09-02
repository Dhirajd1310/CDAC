import java.util.Scanner;
class SqurOrReact{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length:");
		int length = sc.nextInt();
		
		System.out.println("Enter the breadth:");
		int breadth = sc.nextInt();
		
		if(length == breadth){
			System.out.println("Square Garden.");
		} else{
			System.out.println(	"Rectangle Garden");
		}
	}
}
