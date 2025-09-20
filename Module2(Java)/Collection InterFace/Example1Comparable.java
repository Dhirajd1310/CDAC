import java.util.*; 

class Employee implements Comparable<Employee> { 
    int empid; 
    String ename; 
    double salary; 

    Employee(int empid, String ename, double salary) { 
        super(); 
        this.empid = empid; 
        this.ename = ename; 
        this.salary = salary; 
    } 

    @Override 
    public String toString() { 
        return "empid = " + empid + 
               ", ename = " + ename + 
               ", salary = " + salary; 
    } 

    @Override 
    public int compareTo(Employee emp2) { 
        if (this.salary < emp2.salary) 
            return -1; 
        else if (this.salary > emp2.salary) 
            return 1; 
        else  
            return 0; 
    } 
} 

class Example1Comparable { 
    public static void main(String[] args) { 
        ArrayList<Employee> list = new ArrayList<Employee>(); 
        
        list.add(new Employee(4, "RAMESH", 30000)); 
        list.add(new Employee(3, "SURESH", 40000)); 
        list.add(new Employee(1, "MUKESH", 45000));  
        list.add(new Employee(7, "GANESH", 47000)); 
        list.add(new Employee(5, "MAHESH", 42000)); 
        list.add(new Employee(2, "RAJESH", 35000)); 
        list.add(new Employee(6, "RAMESH", 57000)); 

        Collections.sort(list); 

        ListIterator<Employee> li = list.listIterator(); 
        while (li.hasNext()) { 
            Employee emp = li.next(); 
            System.out.println(emp); 
        } 
    } 
} 

/*
empid = 4, ename = RAMESH, salary = 30000.0 
empid = 2, ename = RAJESH, salary = 35000.0 
empid = 3, ename = SURESH, salary = 40000.0 
empid = 5, ename = MAHESH, salary = 42000.0 
empid = 1, ename = MUKESH, salary = 45000.0 
empid = 7, ename = GANESH, salary = 47000.0 
empid = 6, ename = RAMESH, salary = 57000.0 
*/