class Student{
	private String name;
	private int marks;
	
	private static int totalStudents=0;
	
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
		totalStudents++;
	}
	
	public int getMarks(){
		return marks;
	}
	public void setMarks(int marks){
		this.marks=marks;
	}
	 public boolean isPassed(){
		 if(marks>=35){
			 return true;
		 }else {
			 return false;
		 }
	}
	public static void showTotalStudents(){
		System.out.println("Total Students: "+totalStudents);
	} 
	
}
class StudentDriver{
	public static void main(String[]args){
		Student s1 = new Student("Rahul",78);
		Student s2 = new Student("Pooja",34);
		Student s3 = new Student("Amit",65);
		
		System.out.println("Student Rahul Passed? "+s1.isPassed());
		System.out.println("Student Pooja Passed? "+s2.isPassed());
		System.out.println("Student Amit Passed? "+s2.isPassed());
		
		Student.showTotalStudents();
	}
}