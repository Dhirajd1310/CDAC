

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;


class Employee{
	private int empid;
	private String empName;
	public Employee(int empid, String empName) {
		super();
		this.empid = empid;
		this.empName = empName;
	}
	@Override
	public String toString() {
		return empid + " " + empName ;
	}
	@Override
	public int hashCode() {
		return empid%10;
	}
	//This generates a hash code based on the last digit of the employee ID.
	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(obj instanceof Employee ){
			Employee e = (Employee)obj;
			return empid == e.empid;
		}
		return false;			
	}
	/* Checks for equality based only on empid.So even if
	  two employees have the same empid but different names, 
	  they are considered equal.*/
}
 class CollectionDemo17 {

	public static void main(String[] args) {
		
     // ArrayList<Employee> a = new ArrayList<Employee>();
		HashSet<Employee> a = new HashSet<Employee>();
		a.add(new Employee(13, "Dhiraj"));
		a.add(new Employee(11, "Patil"));
		a.add(new Employee(46, "Sir"));
		a.add(new Employee(55, "Mohit"));
		a.add(new Employee(37, "Keshav"));
		
		for(Employee e : a) {
			System.out.println(e);
		}
	}
}
