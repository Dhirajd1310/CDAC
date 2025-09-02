class StudentFees{
	private String name;
	private String className;
	
	private static double tutionFees;
	
	static{
		tutionFees=30000d;
		System.out.println("School Tuition Fee Intialized: "+tutionFees);
	}
	StudentFees(String name,String className){
		this.name=name;
		this.className=className;
	}
	
	public String getName(){
		return name;
	}
	public String className(){
		return className;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setClassName(String className){
		this.className=className;
	}
	public void printStudentDetails(){
		System.out.println("Name="+name+", Class"+className+", Tution Fee="+tutionFees);
	}
}
class StudentFeesDriver{
	public static void main(String[]args){
		StudentFees s1 = new StudentFees("Anjali","10th");
		StudentFees s2 = new StudentFees("Vikram","12th");
		
		System.out.print("Student1: ");
		s1.printStudentDetails();
		
		System.out.print("Student2: ");
		s2.printStudentDetails();
	}
}