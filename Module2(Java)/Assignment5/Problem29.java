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
class Problem29{
	public static void main(String[]args){
	  ArrayList<Student> a = new ArrayList<Student>();
	   a.add(new Student("Amit","A"));
	   a.add(new Student("Priya","B"));
	   System.out.print("Students Records: ");
	   Iterator<Student> it = a.iterator();
	   while(it.hasNext()){
		   System.out.print(it.next());
		   if(it.hasNext()){
			   System.out.print(",");
		   }
	   }
	}
}
