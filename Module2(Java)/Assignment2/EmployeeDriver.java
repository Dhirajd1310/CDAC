class Employee{
	private String name;
	private double salary;
	private int yearOfService;
	
	private static int totalEmployee = 0;
	
	Employee(String name,double salary,int yearOfService){
		this.name=name;
		this.salary=salary;
		this.yearOfService=yearOfService;
		totalEmployee++;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return salary;
	}
	public int getYearOfService(){
		return yearOfService;
	}
	public int getTotalEmployee(){
		return totalEmployee;
	}
	
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void setYearOfService(int yearOfService){
		this.yearOfService=yearOfService;
	}
	
	public double calculateBonus(){
		if(yearOfService>5){
			return salary*0.05;
		}else {
			return 0;
		}
	}
	 public static void showTotalEmployee(){
		 System.out.println("Total Employee : "+ totalEmployee);
	 }
}
class EmployeeDriver{
	public static void main(String[]args){
	
	Employee e1 = new Employee("Ravi",150000d,6);
	Employee e2 = new Employee("Anita",120000d,3);
	Employee e3 = new Employee("Suresh",100000d,5);
	
	System.out.println("Employee Ravi Bonus: "+e1.calculateBonus());
	System.out.println("Employee Anita Bonus: "+e2.calculateBonus());
	System.out.println("Employee Suresh Bonus: "+e3.calculateBonus());
	
	Employee.showTotalEmployee();
	}
	
}