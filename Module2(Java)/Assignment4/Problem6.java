import java.util.Scanner;
class AgeNotValidException extends RuntimeException{
	AgeNotValidException(String dese){
		super(dese);
	}
}
class Problem6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age:");
		int age = sc.nextInt();
		
		try{
			if(age<18){
				throw new AgeNotValidException("Age NotValid Exception:Age must be>=18");
			}else {
				System.out.println("You are eligible to do work");
			}
		}catch(AgeNotValidException e){
			System.out.println(e.getMessage());
		}
	}
}