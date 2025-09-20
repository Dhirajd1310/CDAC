import java.util.*;

class Problem6{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Set<Integer> rollNumber = new LinkedHashSet<>();
		
		System.out.println("Enter the roll numbers ypu want to add:");
		int n = sc.nextInt();
		
		System.out.println("Enter " + n + " roll number :");
		for(int i=0;i<n;i++){
			int roll = sc.nextInt();
			rollNumber.add(roll);
		}
		
		System.out.print("Unique roll numbers:");
		Iterator<Integer> it = rollNumber.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+ " " );
		}
	}
}