import java.util.Scanner;
class SeasonBasedMonth{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a month(1-12):");
		int month = sc.nextInt();
		
		 if (month == 12 || month == 1 || month == 2) {
			  System.out.println("Season is Winter.");
		 }else if (month >= 3 && month <= 5){
			 System.out.println("Season is Summer.");
		 }else if (month >= 6 && month <= 8){
			 System.out.println("Season is Moonsoon.");
		 }else if (month >= 9 && month <= 11){
			 System.out.println("Season is Autumn.");
		 }else {
			 System.out.println("Invalid Month.");
		 }
	}
}
