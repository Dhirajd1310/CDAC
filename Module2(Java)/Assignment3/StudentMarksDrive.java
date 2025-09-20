class StudentMarks{
	private int marks;
	
	StudentMarks(int marks){
		this.marks=marks;
	}
	public void setMarks(int marks){
		 if(marks=>0 && marks<=0){
			 System.out.println("Marks: "+marks);
		 }else {
			 System.out.pritnln("Marks are not validate.");
		 }
	}
	public int getMarks(){
		 return marks;
	}
}
class StudentMarksDriver{
	public static void main(String []args){
		StudentMarks S1 = new StudentMarks(85);
		B1.setMarks();
	}

}