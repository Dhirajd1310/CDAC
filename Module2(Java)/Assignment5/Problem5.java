import java.util.*;

class Problem5{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Deque<String> str = new LinkedList<String>();
		
		System.out.println("Enter the Searches:");
		int n = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++){
			String search = sc.nextLine();
			str.add(search);
			
			if(str.size()>5){
			str.poll();
			} 
		}
		System.out.println("Recent Searches: "+str);
	}
}

		