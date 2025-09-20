

import java.util.Comparator;
import java.util.TreeSet;


class Employee{
    int empid;
	String empName;
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empid + " " + empName ;
	}
}

class EmployeeComparator implements Comparator<Employee>{
	//Sort by empid (ascending)
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.empid - o2.empid;
		
	}
}
class EmployeeComparator1 implements Comparator<Employee>{
	//Sort by empName (alphabetically)
	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.empName.compareTo(o2.empName);
	}
}
public class CollectionDemo19 {

	public static void main(String[] args) {
	
		TreeSet<Employee> a = new TreeSet<Employee>(new EmployeeComparator());
		a.add(new Employee(13, "Dhiraj"));
		a.add(new Employee(34, "Patil"));
		a.add(new Employee(55, "Mohit"));
		a.add(new Employee(46, "Sir"));
		a.add(new Employee(37, "Karan"));
		
		for(Employee e : a) {
			System.out.println(e); //Empid acecending order
			
		}
		System.out.println("______________");
		
		a =  new TreeSet<Employee>(new EmployeeComparator1());
		//alphabetical order
		a.add(new Employee(13, "Dhiraj"));
		a.add(new Employee(34, "Patil"));
		a.add(new Employee(55, "Mohit"));
		a.add(new Employee(46, "Sir"));
		a.add(new Employee(37, "Karan"));
		
		for(Employee e : a) {
			System.out.println(e);
			
		}
		
	}
}
