class Employee {
    private int age;
    public void setAge(int age) {
        if(age < 18) System.out.print("Invalid ");
        else this.age = age;
    }
    public int getAge() { return age; }
}

public class Test1 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setAge(15);
        System.out.println(e.getAge());
    }
}