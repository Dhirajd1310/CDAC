
//Problem 5: Online Shopping 

import java.util.Scanner;
class Problem5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of Products:");
		int noOfProducts=sc.nextInt();
		
		double productPrices[] = new double[noOfProducts];
		System.out.println("Enter the Prices Of Products:");
		for(int i=0;i<productPrices.length;i++){
			productPrices[i]=sc.nextDouble();
		}
		
		System.out.println("Enter the product you want to buy:");
		int index=sc.nextInt();
		
		System.out.println("Enter the quantity you want to purchase:");
		int quantity=sc.nextInt();
		
		try{
			if(index<0 || index>=productPrices.length){
				throw new ArrayIndexOutOfBoundsException("Array index exception");
			}
			
		    if(quantity <= 0){
						throw new ArithmeticException("ArithmeticException caught");
			}
			
			double totalPrice = productPrices[index]*quantity;
			System.out.println("Total Price:" +totalPrice);
			
		}catch(ArrayIndexOutOfBoundsException aee){
			System.out.println(aee.getMessage());
			
		}catch(ArithmeticException ae){
					System.out.println(ae.getMessage());
		}
			
	}
}
		
				

		
		
		