class EmployeeSalary{
	String name;
	double salary;
	
	EmployeeSalary(String name , double salary){
		this.name=name;
		this.salary=salary;
	}
	public void  displaySalary(){
		System.out.println(name + " Salary ="+ salary);
	}
	
}
class Manager extends EmployeeSalary{
	Manager(String name , double salary){
		super(name,salary);
	}
	@Override
	public void displaySalary(){
		double totalSalary = salary + (salary *0.2);
		System.out.println(name + " Total Salary ="+ totalSalary);
	}
	
}
class Developer extends EmployeeSalary{
	Developer(String name , double salary){
		super(name,salary);
	}
	@Override
	public void displaySalary(){
		double totalSalary = salary + (salary *0.1);
		System.out.println(name + " Total Salary ="+ totalSalary);
	}
}
class EmployeeSalaryDriver{
	public static void main(String[]args){
		EmployeeSalary e1 = new Manager("Dhiraj",50000);
		EmployeeSalary e2 = new Developer("Patil",45000);
		
		e1.displaySalary();
		e2.displaySalary();
	}
}