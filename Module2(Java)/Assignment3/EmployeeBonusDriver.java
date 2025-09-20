abstract class EmployeeBonus{
	String name ;
	double salary;
	
	EmployeeBonus(String name,double salary){
		 this.name=name;
		 this.salary=salary;
	}
	
	abstract double calculateBonus();
}
class Manager extends EmployeeBonus{
	Manager(String name,double salary){
		super(name,salary);
	}
	
	@Override
	double calculateBonus(){
		return salary*0.2;
	}
}
class Developer extends EmployeeBonus{
	Developer(String name , double salary){
		super(name,salary);
	}
	
	@Override
	double calculateBonus(){
		return salary*0.1;
	}
}
class EmployeeBonusDriver{
	public static void main(String[]args){
		EmployeeBonus mang = new Manager("Dhiraj",30000);
		EmployeeBonus dev = new Developer("Patil",25000);
		
		System.out.println(mang.name +" Bouns is = "+mang.calculateBonus());
		System.out.println(dev.name +" Bouns is = "+dev.calculateBonus());
	}
}