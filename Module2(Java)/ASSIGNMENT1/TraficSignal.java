import java.util.Scanner;
class TraficSignal{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter trafic light color:");
		String color = sc.next();
		
		if(color.equals("Green")){
			System.out.println("Go.");
		}else if(color.equals("Yellow")){
			System.out.println("Wait.");
		}else if(color.equals("Red")){
			System.out.println("Stop.");
		}else {
			System.out.println("Wrong input.");
		}
	}
}

			
