class StudentGrade{
	private int rollNo;
	private String name;
	private int marks;
	
	StudentGrade(int rollNo,String name,int marks){
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
	
	public String calculateGrade(){
		if(marks>=80){
			return "A";
		}else if(marks>=60){
			return "B";
		}else if(marks>=40){
			return "C";
		}else {
			return "Fail";
		}
	}
	
	public void printStudentInfo(){
		System.out.println("Roll No="+rollNo+", Name="+name+", Marks="+marks);
	}
}
class StudentGradeDriver{
	public static void main(String[]args){
		StudentGrade S1 = new StudentGrade(1,"Dhiraj",85);
		StudentGrade S2 = new StudentGrade(2,"Patil",45);
		
		System.out.print("Student1: ");
		S1.printStudentInfo();
		System.out.println("Grade of Student1:"+S1.calculateGrade());
		
		
		System.out.print("Student2: ");
		S2.printStudentInfo();
		System.out.println("Grade of Student2:"+S2.calculateGrade());
	}
}
