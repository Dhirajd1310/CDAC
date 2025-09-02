class StudentMarks{
	private int rollNo;
	private String name;
	private int marks;
	
	StudentMarks(int rollNo,String name,int marks){
		this.rollNo=rollNo;
		this.name=name;
		this.marks=marks;
	}
	
	public int getMarks(){
		return marks;
	}
	
	public void setMarks(int marks){
		this.marks=marks;
	}
	
	public void printStudentInfo(){
		System.out.println("Roll No="+rollNo+", Name="+name+", Marks="+marks);
	}
}
class StudentMarksDriver{
	public static void main(String[]args){
		StudentMarks S1 = new StudentMarks(1,"Dhiraj",85);
		
		System.out.print("Student1: ");
		S1.printStudentInfo();
		
		System.out.println("Marks after recheck:");
		S1.setMarks(95);
		
		System.out.print("Student1: ");
		S1.printStudentInfo();
	}
}
