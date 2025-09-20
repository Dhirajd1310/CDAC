class Student{
	int id;
	String name;
	
	Student(int id , String name){
		this.id=id;
		this.name=name;
	}
}
class ExampleGetClass{
	public static void main(String[]args){
		Student obj1 = new Student(1,"Dhiraj");
		System.out.println(obj1.getClass());
		String str = new String("Hello");
		System.out.println(str.getClass());
		Integer a = 10;
        System.out.println(a.getClass()); 
	}
}