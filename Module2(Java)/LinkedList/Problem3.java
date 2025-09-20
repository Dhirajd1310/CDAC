import java.util.*;

class Problem3{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<String>();
		System.out.println("Enter number of task you want to Add: ");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for(int i=0;i<n;i++){
			System.out.print("Add Taks: ");
			String task = sc.nextLine();
			list.add(task);
		}
		System.out.println("Added Tasks: "+list);
		
	
		
		System.out.println("Enter the completed Task:");
		String compTask=sc.nextLine();
		
		if(list.remove(compTask)){
			System.out.println("complete task: "+  compTask);
		}else {
			System.out.println("Task not Found");
		}
		
		System.out.println("Remaining Tasks: "+ list);
		
	}
}