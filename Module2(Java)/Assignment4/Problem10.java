
//Problem 10: Greeting Message
import java.util.Scanner;
class Problem10{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		String firstText = sc.nextLine();
		
		String addText = sc.nextLine();
		
		int index = sc.nextInt();
		sc.nextLine();
		
		String afterIndex=sc.nextLine();
		
		
		StringBuilder sb = new StringBuilder(firstText);
		sb.insert(index , addText + " ");
		sb.append(afterIndex);
		 
		System.out.println("Final Message:");
		System.out.println(sb.toString());
	}
}