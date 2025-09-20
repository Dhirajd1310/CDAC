class Staff{
	String name;
	int staffId;
	
	Staff(String name , int staffId){
		this.name=name;
		this.staffId=staffId;
	}
	
	public void displayDetails(){
		System.out.println(name + " Staff id is " + staffId);
	}
}
class Doctor extends Staff {
	String specialization;
	Doctor(String name , int staffId,String specialization){
		super(name,staffId);
		this.specialization=specialization;
	}
	
	@Override
	public void displayDetails(){
		System.out.println("Doctor: "+name + " Staff id is: " + staffId +" Specialization is : "+specialization);
	}
}  
class Nurse extends Staff{
	String shift;
	Nurse(String name , int staffId,String shift){
		super(name,staffId);
		this.shift=shift;
	}
	@Override
	public void displayDetails(){
		System.out.println("Nurse: "+name + " Staff id is: " + staffId +" Shift is: "+shift);
	}
}
class HospitalDriver21{
	public static void main(String[]args){
		Staff d =new Doctor("Dr.Dhiraj Patil",175,"Cardiology");
		Staff n = new Nurse("Disha Patani",987,"Night");
		
		d.displayDetails();
		n.displayDetails();
	}

}