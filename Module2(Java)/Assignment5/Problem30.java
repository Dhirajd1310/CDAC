import java.util.*;
class Student{
	String name;
	String grade;
	
	Student(String name,String grade){
		this.name=name;
		this.grade=grade;
	}
	@Override
	public String toString(){
		return name+":"+grade;
	}
}
class Problem30{
	public static void main(String[]args){
	  ArrayList<Student> a = new ArrayList<Student>();
	   a.add(new Student("Amit","A"));
	   a.add(new Student("Priya","B"));
	   a.add(new Student("Dhiraj","D"));
	   a.add(new Student("Mohit","A+"));
	   
	   System.out.print("Qualified Students: ");
	   Iterator<Student> it = a.iterator();
	   while(it.hasNext()){
		  Student s = it.next();
		  if(s.grade.compareTo("B")>0){
			  it.remove();
		  }
	   }
	   Iterator<Student> it2 = a.iterator();
	   while(it2.hasNext()){
		   Student s = it2.next();
		   System.out.print(s);
		   if(it2.hasNext()){
			   System.out.print(", ");
		   }
	   }
	}
}
