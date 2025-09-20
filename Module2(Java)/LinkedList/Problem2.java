import java.util.*;
class Problem2{
	public static void main(String[]args){
		Deque<String> dq = new LinkedList<String>();
		
		dq.add("Amit");
		dq.add("Priya");
		dq.add("Rohan");
		
		System.out.println("Enqueue : "+ dq);
		
		 dq.remove("Amit");
		
		System.out.println("Queue : "+ dq);
	}
}