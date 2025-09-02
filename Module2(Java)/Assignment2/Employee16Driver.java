class Employee16{
	private int id;
	private String name;
	private double basicSalary;
	
	private static int iDs=1001;
	
	Employee16(){
		this.name = "Unknown";
		this.basicSalary = 20000d;
		this.id = iDs++;
	}
	Employee16(String name,double basicSalary){
		this.name = name;
		this.basicSalary = basicSalary;
		this.id = iDs++;
	}
	public double netSalary(){
		
		double hra = 0.10*basicSalary;
		double da = 0.05*basicSalary;
		double pf = 0.02*basicSalary;
		
		return  basicSalary + hra + da - pf;
		
	}
	
	public int getId(){
		return id;
	}
	public String getName(){
		return name;
	}
	public double getSalary(){
		return basicSalary;
	}
	public void printEmployeeInfo(){
		System.out.println("ID="+id+", Name="+name+", Salary="+basicSalary +" Net Salary= "+ netSalary());
		
		
	}
	
}


class Employee16Driver{
	public static void main(String[]args){
		Employee16 e1 = new Employee16();
		Employee16 e2 = new Employee16("Dhiraj",25000d);
		
		System.out.print("Employee1:");
		e1.printEmployeeInfo();
		
		
		System.out.print("Employee2:");
		e2.printEmployeeInfo();
		
	
	}
}