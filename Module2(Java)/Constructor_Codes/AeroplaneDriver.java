//Parametrized Constructor

class Aeroplane{
	String company;
	String type;
	int noEngine;
	int SeatingCap;
	double travellingRange;
	
	Aeroplane(String company,String type,int noEngine,int SeatingCap,double travellingRange){
		this.company=company;
		this.type=type;
		this.noEngine=noEngine;
		this.SeatingCap=SeatingCap;
		this.travellingRange=travellingRange;
	}
	public void display(){
		System.out.println(this.company);
		System.out.println(this.type);
		System.out.println(this.noEngine);
		System.out.println(this.SeatingCap);
		System.out.println(this.travellingRange);
	}
}


class AeroplaneDriver{
	public static void main(String[]args){
		Aeroplane obj = new Aeroplane("Air India","Commercial",8,500,6000d);
		obj.display();
	}
}