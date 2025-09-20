import java.util.Scanner;
class Student{
	String sname;
	Student(String sname){
		this.sname=sname;
	}
	@Override
	public String toString(){
		return sname;
	}
	
	@Override 
    @SuppressWarnings("removal")
	public void finalize() throws Throwable{
		System.out.println("Object got destroyed");
	}
}
class FinalizeExample{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[]args){
		System.out.println("Enter the name");
		String name = sc.next();
		Student obj = new Student(name);
		System.out.println(obj);
		obj.finalize();
		obj=null;
	}
}