//Employee class + ArrayList
import java.util.ArrayList;

class Employee {
    private int empId;
    private String empName;

    // constructor
    public Employee(int empId, String empName) {
        super();
        this.empId = empId;
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", empName=" + empName + "]";
    }
}

public class CollectionDemo16 {
    public static void main(String[] args) {
        ArrayList<Employee> a = new ArrayList<>();

        // runtime object creation
        a.add(new Employee(31, "Raj"));
        a.add(new Employee(36, "Rama"));
        a.add(new Employee(3, "Dhiraj"));
        a.add(new Employee(316, "Bhagyesh"));

       // print using for-each
        for (Employee e : a) {
            System.out.println(e);
        }
    }
}