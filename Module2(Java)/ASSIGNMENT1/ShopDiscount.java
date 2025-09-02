import java.util.Scanner;
class ShopDiscount{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter total Purchase Amount:");
		double amt = sc.nextDouble();
		
		double finalamt=0;
		
		if(amt>1000){
			finalamt = amt - (amt*0.10);
		} else {
			finalamt =amt ;
		}
		
		System.out.println("Final cost after Discount :"+finalamt);
	}
}
