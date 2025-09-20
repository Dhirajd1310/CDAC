

import java.util.TreeSet;



class Employee implements Comparable<Employee>{//Step 1
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
	@Override //Step2
	public int compareTo(Employee o) {
		return empid - o.empid;
	}
	/*Add 34: compare to 13 → 34 - 13 = 21 → go right → insert

Add 55: compare to 13 → 55 - 13 = 42 → right
compare to 34 → 55 - 34 = 21 → right → insert

Add 46: compare to 13 → right
compare to 34 → right
compare to 55 → 46 - 55 = -9 → left → insert

And so on. This way, a binary tree structure is built internally in sorted order.*/
}

public class CollectionDemo18 {

	public static void main(String[] args) {
		
		TreeSet<Employee> a = new TreeSet<Employee>();
		a.add(new Employee(13, "Dhiraj"));
		a.add(new Employee(34, "Patil"));
		a.add(new Employee(55, "Mohit"));
		a.add(new Employee(46, "Sir"));
		a.add(new Employee(37, "manoj"));
		
		for(Employee e : a) {
			System.out.println(e);
		}
	}
}

