import java.util.*;

class Problem7{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Set<String> students = new TreeSet<>();
		
		System.out.println("Enter the Students names you want to add:");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the "+ n + " names ");
		for(int i =0; i<n ;i++){
			String  name=sc.nextLine();
			students.add(name);
		}
		
		System.out.println("Alphabetical Order Students are:");
		Iterator<String> it = students.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
	}
}
		