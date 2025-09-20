import java.util.Scanner;
class InvalidNumberException extends RuntimeException{
	InvalidNumberException(String dese){
		super(dese);
	}
}
class Problem9{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks(0-100)");
		int marks=sc.nextInt();
		
		try{
			if(marks >=0 && marks <= 100){
				System.out.println("Valid marks:"+marks);
			}else{
				throw new InvalidNumberException("Invalid Marks");
			}
		}catch(InvaidNumberException e){
			System.out.println(e.getMessage());
		}
	}
}