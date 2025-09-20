import java.util.*;

class Problem8{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		Set<String> course = new LinkedHashSet<>();
		
		System.out.println("Enter the Course code want to add:");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter " + n + " course code :");
		for(int i=0;i<n;i++){
			String courseCode = sc.nextLine();
			course.add(courseCode);
		}
		
		System.out.print("Registred Courses:");
		Iterator<String> it = course.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+ " " );
		}
	}
}