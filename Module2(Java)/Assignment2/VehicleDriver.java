class Vehicle{
	private String regNo="MH-2025-";
	private String ownerName;
	private String vehicleType;
	
	private static int vehicleCount=0;
	
	Vehicle(String ownerName,String vehicleType){
		vehicleCount++;
		this.ownerName=ownerName;
		this.vehicleType=vehicleType;
		this.regNo="MH-2025-"+vehicleCount;
		
	}
	public String getRegNo(){
		 return regNo;
	}
	
	public String getownerName(){
		 return ownerName;
	}
	
	public String getvehicleType(){
		 return vehicleType;
	}
	public static int getvehicleCount(){
		return vehicleCount;
	}
	
	public void printVehicleDetails(){
		System.out.println("Owner Name="+ownerName+", Vehicle Type="+vehicleType+", Reg. No="+regNo);
	}
}
class VehicleDriver{
	public static void main(String[]args){
		Vehicle v1 = new Vehicle("Mohit","2-wheeler");
		Vehicle v2 = new Vehicle("Shantanu","4-wheeler");
		
		System.out.print("Vehicle1=");
		v1.printVehicleDetails();
		
		System.out.print("Vehicle2=");
		v2.printVehicleDetails();
		
		System.out.println("Total Number Of vehicles= "+Vehicle.getvehicleCount());
		
	}
}