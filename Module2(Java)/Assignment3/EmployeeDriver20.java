class Employee{
	String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displaySalary() {
        System.out.println(name + " Salary = " + salary);
    }
}
class TeachingStaff extends Employee{
	 String subject;

    TeachingStaff(String name, double salary, String subject) {
        super(name, salary);
        this.subject = subject;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " -> Subject = " + subject + ", Salary = " + salary);
    }
}
class Professor extends TeachingStaff{String specialization;

    Professor(String name, double salary, String subject, String specialization) {
        super(name, salary, subject);
        this.specialization = specialization;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " -> Subject = " + subject +", Specialization = " + specialization +", Salary = " + salary);
    }
}
class Lecturer extends TeachingStaff{
	String department;

    Lecturer(String name, double salary, String subject, String department) {
        super(name, salary, subject);
        this.department = department;
    }

    @Override
    public void displaySalary() {
        System.out.println(name + " ->Subject = " + subject +", Department = " + department +", Salary = " + salary);
    }
}
class EmployeeDriver20{
	public static void main(String[]args){
		Professor p = new Professor("Dhiraj", 80000, "Math", "Algebra");
        p.displaySalary();

        Lecturer l = new Lecturer("Patil", 50000, "Physics", "Science");
        l.displaySalary();
	}
}