import java.util.*;
class Employee {
	String name;
	double sal;
	
	Employee(String name,double sal){
		this.name=name;
		this.sal=sal;
	}
	@Override
	public String toString(){
		return name+":"+(int)sal;
	}
}
class sortBySal implements Comparator<Employee>{
	@Override
	public int compare(Employee e1 , Employee e2){
		return Double.compare(e1.sal,e2.sal);
	}
}
class Problem27{
	public static void main(String[]args){
	  ArrayList<Employee> a = new ArrayList<Employee>();
	   a.add(new Employee("Amit",50000));
	   a.add(new Employee("Priya",60000));
	   a.add(new Employee("Dhiraj",45000));
	   
	   Collections.sort(a,new sortBySal());
	   Iterator<Employee>it=a.iterator();
	   while(it.hasNext()){
		   System.out.print(it.next());
		   if(it.hasNext()){
			   System.out.print(",");
		   }
	   }
	}
}
