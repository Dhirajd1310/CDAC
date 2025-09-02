class TicketBooking{
	private String passengerName;
	private int ticketNo;
	
	private static int counter=5001;
	
	TicketBooking(String passengerName){
		this.passengerName=passengerName;
		this.ticketNo=counter;
		counter++;
	}
	public void displayTicket(){
		 System.out.println("Ticket No: "+ticketNo+", Passenger:"+passengerName);
	}
}
class TicketBookingDriver{
	public static void main(String[]args){
		TicketBooking t1 = new TicketBooking("Rahul");
		TicketBooking t2 = new TicketBooking("Priya");
		TicketBooking t3 = new TicketBooking("Amit");
		
		t1.displayTicket();
		t2.displayTicket();
		t3.displayTicket();
		
	}
}