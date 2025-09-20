class Staff{
	String name;
	double salary;
	
	Staff(String name , double salary){
		this.name=name;
		this.salary=salary;
	}
	
}

class TeachingStaff extends Staff{
	String subject;
	TeachingStaff(String name , String subject , double salary){
		super(name,salary);
		this.subject=subject;
	}
	
	
	public void displayTeachingStaff(){
		System.out.println("Name= "+name+" Subject= "+subject+" Salary="+salary);
	}
}
class NonTeachingStaff extends Staff{
	String department;
	NonTeachingStaff(String name , String department , double salary){
		super(name,salary);
		this.department=department;
	}
	
	public void displayNonTeachingStaff(){
		System.out.println("Name= "+name+" Department= "+department+" Salary="+salary);
	}
} 
class StaffDriver{
	public static void main(String[]args){
		TeachingStaff s1 = new TeachingStaff("Dhiraj","English",60000);
		s1.displayTeachingStaff();
		
		NonTeachingStaff s2 = new NonTeachingStaff("Patil","Account",50000);
		s2.displayNonTeachingStaff();
	}
}