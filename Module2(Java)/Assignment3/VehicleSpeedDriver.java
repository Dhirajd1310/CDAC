class VehicleSpeed{
	public void displaySpeed(){
		System.out.println("Vehicle Speed Unknown");
	}
}
class CarSpeed extends VehicleSpeed{
	@Override
	public void displaySpeed(){
		System.out.println("Car Speed 120 km/h");
	}
	
}
class BikeSpeed extends VehicleSpeed{
	@Override
	public void displaySpeed(){
		System.out.println("Bike Speed 80 km/h");
	}
}
class VehicleSpeedDriver{
	public static void main(String[]args){
		VehicleSpeed v1 = new CarSpeed();
		VehicleSpeed v2 = new BikeSpeed();
		
		v1.displaySpeed();
		v2.displaySpeed();
	}
}





