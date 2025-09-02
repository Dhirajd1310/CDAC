class Employee15{
	private int id;
	private String name;
	private double basicSalary;
	
	private static int iDs=1001;
	
	Employee15(){
		this.name = "Unknown";
		this.basicSalary = 20000d;
		this.id = iDs++;
	}
	Employee15(String name,double basicSalary){
		this.name = name;
		this.basicSalary = basicSalary;
		this.id = iDs++;
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
		System.out.println("ID="+id+", Name="+name+", Salary="+basicSalary);
	}
	
}


class Employee15Driver{
	public static void main(String[]args){
		Employee15 e1 = new Employee15();
		Employee15 e2 = new Employee15("Dhiraj",25000d);
		
		System.out.print("Employee1:");
		e1.printEmployeeInfo();
		
		System.out.print("Employee2:");
		e2.printEmployeeInfo();
	
	}
}