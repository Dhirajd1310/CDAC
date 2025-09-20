class Employee { 
    int eid; 
    String ename; 
    Employee(int eid, String ename) { 
        this.eid = eid; 
        this.ename = ename; 
    } 
    public boolean equals(Object obj) { 
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Employee obj2 = (Employee) obj;

        return this.eid == obj2.eid && this.ename.equals(obj2.ename);
    } 
    public String toString() { 
        return "Eid: " + eid + ", Ename: " + ename; 
    } 
} 
public class ExampleEquals2 { 
    public static void main(String[] args) { 
        Employee obj1 = new Employee(1, "Ramesh"); 
        Employee obj2 = new Employee(2, "Suresh"); 
        System.out.println(obj1 == obj2);              
        System.out.println(obj1.equals(obj2));         
        Employee obj3 = new Employee(1, "Ramesh"); 
        System.out.println(obj1.equals(obj3));        
    } 
}
