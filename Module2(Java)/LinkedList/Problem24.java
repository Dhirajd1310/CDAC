import java.util.*;

class Problem24{
	public static void main(String[]args){
		Deque<String> jobs = new LinkedList<>();
		
		jobs.add("Doc1");
		jobs.add("Doc2");
		jobs.add("Doc3");
		
		
		String currentJob = jobs.poll();
		System.out.print("Printing : "+currentJob);
		System.out.print(",Queue: "+ String.join(",", jobs));
	}
}
