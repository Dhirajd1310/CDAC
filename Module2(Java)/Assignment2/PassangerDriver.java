class Passanger{
	private String name;
	private int age;
	private String seatype;
	private static int totalTicketsbooked=0;
	
	Passanger(String name,int age){
		this.name=name;
		this.age=age;
		this.seatype="Genral";
		totalTicketsbooked++;
	}
	
	Passanger(String name,int age,String seatype){
		this.name=name;
		this.age=age;
		this.seatype=seatype;
		totalTicketsbooked++;
	}
	
	public void printpassengers(){
		System.out.println("Name:"+name+",Age:"+age+",Seat:"+ seatype);
	}
	
	public static int getTotalPassengers(){
		return  totalTicketsbooked;
	}
}


class PassangerDriver{
	public static void main(String[] args){
		Passanger p1 = new Passanger("Ravi",25);
		Passanger p2 = new Passanger("Anita",30,"AC Sleeper");
		Passanger p3 = new Passanger("Suresh",40);
		
		System.out.print("Passanger1: ");
		p1.printpassengers();
		
		System.out.print("Passanger2: ");
		p2.printpassengers();
		
		System.out.print("Passanger3: ");
		p3.printpassengers();
		
		System.out.println("Total Passangers Booked:"+ Passanger.getTotalPassengers());
	}
}