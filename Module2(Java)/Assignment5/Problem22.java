import java.util.*;

class Problem22{
	public static void main(String[]args){
		Deque<String> TicketBooking = new ArrayDeque<>();
		
		TicketBooking.add("Amit");
	    TicketBooking.add("Priya");
		TicketBooking.add("Rohan");
		
		System.out.print("Serving: "+TicketBooking.poll());
		System.out.print("Queue :"+ TicketBooking);
	}
}