class TempSensor{
	private int temperature=0;
	
	public void setTemperature(int t){
		if(t >=0 && t <=100){
			temperature=t;
			System.out.println(temperature +" Temperature is correct ");
		}else {
			System.out.println(t +" Temperature out of the range");
		}
	}
	public int getTemperature(){
		return temperature;
	}
}
class TempSensorDriver{
	public static void main(String[]args){
		TempSensor t1 = new TempSensor();
		t1.setTemperature(-5);
		
		t1.setTemperature(85);
		
		System.out.println("Your Current Temperature is : "+t1.getTemperature());
	}
}