interface LandVehicle{
	void driveOnLand();
}
interface WaterVehicle{
	void driveOnWater();
}

class Amphibious implements LandVehicle,WaterVehicle{
	private String name;
	
	Amphibious(String name){
		this.name=name;
	}
	
	public void driveOnLand(){
		System.out.println(name + " Driving on land");
	}
	
	public void driveOnWater(){
		System.out.println(name + " Driving on water");
	}
}

class VehicleType{
	public static void main(String[]args){
		Amphibious hydrocar = new Amphibious("Hydrocar");
		
		hydrocar.driveOnLand();
		hydrocar.driveOnWater();
	}
}