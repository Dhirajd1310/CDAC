class Customer{
	private String name;
	private String ticketType;
	private static int totalTicketsSold=0;
	
	Customer(String name){
		this.name=name;
		this.ticketType="Normal";
		totalTicketsSold++;
	}
	Customer(String name,String ticketType){
		this.name=name;
		this.ticketType=ticketType;
		totalTicketsSold++;
	}
	
	public void printCustomerDetails(){
		System.out.println("Name:"+name+", Ticket:"+ticketType);
	}
	
	public static int getTotalTicketsSold(){
		return totalTicketsSold;
	}
	
}
class CustomerDriver{
	public static void main(String[]args){
		Customer c1 = new Customer("Rahul");
		Customer c2 = new Customer("Pooja","Premium");
		Customer c3 = new Customer("Amit");
		
		System.out.print("Customer1: ");
		c1.printCustomerDetails();
		
		System.out.print("Customer2: ");
		c2.printCustomerDetails();
		
		System.out.print("Customer3: ");
		c3.printCustomerDetails();
		
		System.out.print("Total Tickets Sold: "+Customer.getTotalTicketsSold());
		
	}
}