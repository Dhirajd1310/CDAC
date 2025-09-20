//Aggregation Example

class Car1{
	String model;
	String brand;
	
	Car1(String model,String brand){
		this.model=model;
		this.brand=brand;
	}
    void displayCar(){
			System.out.println("Car Details:");
			System.out.println("Brand: "+brand);
			System.out.println("Model: "+model);
	}
	void createDriver(){
		Driver1 a = new Driver1("Dhiraj",22,"Male");
		a.displayDriver1();
	}
}

class Driver1{
	String name;
	int age;
	String gender;
	
	Driver1(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	void displayDriver1(){
		System.out.println("Driver Details:");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
	}
	

}

class DriverMain{
	public static void main(String[]args){
		Car1 c = new Car1("BMW","M5");
		c.displayCar();
		c.createDriver();
	}

}