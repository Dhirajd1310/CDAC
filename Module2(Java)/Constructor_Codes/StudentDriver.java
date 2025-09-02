class Student{
	String name;
	String nativeplace;
	int age;
	String gender;
	double contact;
	
	Student(String name,String nativeplace,int age,String gender,double contact){
		this.name=name;
		this.nativeplace=nativeplace;
		this.age=age;
		this.gender=gender;
		this.contact=contact;
	}
	public void display(){
		System.out.println(this.name);
		System.out.println(this.nativeplace);
		System.out.println(this.age);
		System.out.println(this.gender);
		System.out.println(this.contact);
	}
}


class StudentDriver{
	//Parameterized Constructor
	public static void main(String[]args){
		Student a = new Student("Dhiraj","Pune",22,"Male",7767048197d);
		a.display();
	}
}