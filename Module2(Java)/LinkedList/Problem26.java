import java.util.*;
class Employee implements Comparable<Employee>
{
	private String name;
	private double sal;
	
	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString(){
		return name+":"+sal;
	}
	@Override
	public int compareTo(Employee emp2){
		return this.name.compareTo(emp2.name);
	}
}


class Problem26{
	public static void main(String[]args){
	   TreeSet<Employee> a = new TreeSet<Employee>();
	   a.add(new Employee("Amit",50000));
	   a.add(new Employee("Priya",60000));
	   
	   Iterator<Employee>it=a.iterator();
	   while(it.hasNext()){
		   System.out.print(it.next());
		   if(it.hasNext()){
			   System.out.print(", ");
		   }
	   }
	}
}