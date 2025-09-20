//Composition Example

class Car{
	String model;
	String brand;
	Engine engine;
	
	Car(String model,String brand,Engine engine){
		this.model=model;
		this.brand=brand;
		this.engine=engine;
	}
	public void displayCar(){
			System.out.println("Car Details:");
			System.out.println("Brand: "+brand);
			System.out.println("Model: "+model);
	}
}

class Engine{
	int noOfPiston;
	double bhp;
	String engineType;
	Engine(int noOfPiston,double bhp,String engineType){
		this.noOfPiston=noOfPiston;
		this.bhp=bhp;
		this.engineType=engineType;
	}
	public void displayEngine(){
		System.out.println("Engine  Details:");
		System.out.println("No Of Piston: "+this.noOfPiston);
		System.out.println("Break Horse Power: "+this.bhp);
		System.out.println("Engine Type: "+this.engineType);
	}

}

class CarDriver{
	public static void main(String[]args){
		Car c1 = new Car("M5","BMW",new Engine(4,3400d,"V6"));
		c1.displayCar();
		c1.engine.displayEngine();
	}

}