import java.util.*;

class Problem4{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		System.out.println("Enter number of items you want to add : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0;i<n;i++){
			System.out.print("Add items: ");
			String items = sc.nextLine();
			list.add(items);
		}
		System.out.println("Added Items: "+list);
		
	
		
		System.out.println("Enter the purchase items:");
		String purchaseItem=sc.nextLine();
		
		if(list.remove(purchaseItem)){
			System.out.println("Purchase: "+  purchaseItem);
		}else {
			System.out.println("Not added in items");
		}
		
		System.out.println("Items to buy: "+ list);
		
	}
}