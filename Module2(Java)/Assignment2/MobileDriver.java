class Mobile{
	private String model;
	private static int totalMobiles;
	
	public Mobile(String model){
		this.model=model;
		totalMobiles++;
	}
	
	public String getModel(){
		return model;
	} 
	
	public static void TotalMobiles(){
			System.out.println("Total mobiles in Stock: "+totalMobiles);
	}

}
class MobileDriver{
	public static void main(String[]args){
		Mobile m1 = new Mobile("Samsung Galaxy M32");
		Mobile m2 = new Mobile("Redmi Note 12");
		
		System.out.println("Mobile1: model = "+m1.getModel());
		System.out.println("Mobile2: model = "+m2.getModel());
		
		Mobile.TotalMobiles();
		
	}

}