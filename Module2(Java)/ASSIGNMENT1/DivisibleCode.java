import java.util.Scanner;

class DivisibleCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int num= sc.nextInt();
		
		if(num%2==0){
			System.out.println("Number is Divisible by 2.");
		}else{
			System.out.println("Number  is not Divisible by 2");
		}
		if(num%3==0){
			System.out.println("Number is Divisible by 3.");
		}else{
			System.out.println("Number  is not Divisible by 3");
		}
		
		if(num%5==0){
			System.out.println("Number is Divisible by 5.");
		}else{
			System.out.println("Number  is not Divisible by 5");
		}
	}
}

		
		