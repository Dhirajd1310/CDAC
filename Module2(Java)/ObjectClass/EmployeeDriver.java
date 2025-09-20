class Employee{
	String name;
	double salary;
	
	Employee(String name,double salary){
		this.name=name;
		this.salary=salary;
	}
	
	public String getName(){
		return name;
	}
	public  double getSalary(){
		return salary;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	
	public void displayDetails(){
		System.out.println("Name: "+name+",Salary: "+salary);
	}
}

class Manager extends Employee{
	String department;
	double bonus;
	
	Manager(String name,double salary,String department,double bonus){
		super(name,salary);
		this.department=department;
		this.bonus=bonus;
	}
	
	public String getDept(){
		return department;
	}
	public double getBonus(){
		return bonus;
	}
	public void setDept(String department){
		this.department=department;
	}
	public void setBonus(double bonus){
		this.bonus=bonus;
	}
	
	@Override
	public void displayDetails(){
		super.displayDetails();
		System.out.println("Department: "+department+",Bonus: "+bonus);
	}
	public double calculateTotalSalary(){
		if(bonus<0){
			System.out.println("Invalid Bonus");
			bonus=0;
		}
		return salary+bonus;
	}
}

class EmployeeDriver{
	public static void main(String[]args){
		Employee emp1 = new Employee("Alice", 50000);
        Employee emp2 = new Employee("Bob", 55000);
		 
		Manager mgr1 = new Manager("Charlie", 70000, "HR", 5000);
        Manager mgr2 = new Manager("David", 80000, "IT", -3000); 
        Manager mgr3 = new Manager("Eva", 75000, "Finance", 6000);
		
		 System.out.println("Total Salary of " + mgr1.name + ": " + mgr1.calculateTotalSalary());
        System.out.println("Total Salary of " + mgr2.name + ": " + mgr2.calculateTotalSalary());
        System.out.println("Total Salary of " + mgr3.name + ": " + mgr3.calculateTotalSalary());
		
		System.out.println("\n--- Employee Details ---");
        emp1.displayDetails();
        System.out.println();
        emp2.displayDetails();

        System.out.println("\n--- Manager Details ---");
        mgr1.displayDetails();
        System.out.println();
        mgr2.displayDetails();
        System.out.println();
        mgr3.displayDetails();
	}
}