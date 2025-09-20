class Vehicle{
	String brand;
	int speed;
	
	Vehicle(String brand , int speed){
		this.brand = brand ;
		this.speed = speed ;
	}
}

class Car extends Vehicle{
	String modelType;
	Car(String brand,String modelType,int speed){
		super(brand,speed);
		this.modelType=modelType;
	}
	
	public void displayCar(){
		System.out.println("Car -"+ brand + " " + modelType +" , Speed ="+ speed);
	}
}

class Bike extends Vehicle{
	String modelType ;
	Bike(String brand,String modelType,int speed){
		super(brand,speed);
		this.modelType=modelType;
	}
	
	public void displayBike(){
		System.out.println("Bike -"+ brand + " " + modelType +" , Speed ="+ speed);
	}
}

class VehicleDriver{
	public static void main(String[]args){
		Car c = new Car("BMW","M5",200);
		Bike b = new Bike("Royal Enfield","GT-650",180);
		
		c.displayCar();
		b.displayBike();
	}
}