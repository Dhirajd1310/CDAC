class Employee{
	String name;
	double basicSalary;
	
	Employee(String name , double basicSalary){
		this.name=name;
		this.basicSalary=basicSalary;
	}
	
	public double calculateSalary(){
		return basicSalary;
	}
}

class RegularEmployee extends Employee{
	RegularEmployee(String name , double basicSalary){
		super(name,basicSalary);
	}
	
	@Override
	public double calculateSalary(){
		double hra = 0.10 * basicSalary;
		return basicSalary+hra;
	}
	
}

class ContractEmployee extends Employee{
	ContractEmployee(String name ,double basicSalary){
		super(name,basicSalary);
	}
	
	@Override
	public double calculateSalary(){
		double allowance = 0.05*basicSalary;
		return basicSalary+allowance;
	}

}

class EmployeeDriver{
	public static void main(String[]args){
		Employee e1 = new RegularEmployee("Dhiraj",25000);
		Employee e2 = new ContractEmployee("Patil",20000);
		
		System.out.println(e1.name +" Net Salary is = "+ e1.calculateSalary());
		System.out.println(e2.name +" Net Salary is = "+ e2.calculateSalary());
	}
}

