class StudentMarks{
	private int marks;
	
	StudentMarks(int marks){
		this.marks=marks;
	}
	public void setMarks(int marks){
		 if(marks>=0 && marks<=100){
			 this.marks=marks;
			 System.out.println("Marks: "+marks);
		 }else {
			 System.out.println("Marks are not validate.");
		 }
	}
	public int getMarks(){
		 return marks;
}
}
class StudentMarksDriver{
	public static void main(String []args){
		StudentMarks S1 = new StudentMarks(100);
		S1.setMarks(85);
		System.out.println("Final Marks = " + S1.getMarks());
	}

}