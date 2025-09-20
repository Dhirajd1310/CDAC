// Employee class definition
class Employee {
    int eid; // employee ID
    String ename; // employee name

    // Constructor to initialize employee ID and name
    Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }

    // Overriding hashCode() to return eid as the hash code
    public int hashCode() {
        return this.eid; // returns employee ID as hash code
    }

    // Overriding equals() to compare two Employee objects
    public boolean equals(Object obj) {
        Employee obj2 = (Employee) obj; // type casting the object to Employee
        // Comparing eid and ename (Note: string comparison should use .equals())
        if ((this.eid == obj2.eid) && (this.ename == obj2.ename))
            return true; // return true if both ID and name match
        return false; // otherwise return false
    }
}

// Main class to test hashCode() and equals()
class ExampleHashCode {
    public static void main(String[] args) {

        // Creating two Employee objects with same data
        Employee obj1 = new Employee(1, "Ramesh"); // eid = 1, ename = "Ramesh"
        Employee obj2 = new Employee(1, "Ramesh"); // eid = 1, ename = "Ramesh"

        // Creating a third Employee with different data
        Employee obj3 = new Employee(3, "Mahesh"); // eid = 3, ename = "Mahesh"

        // Comparing obj1 and obj2 using equals() → should return true (same data)
        System.out.println(obj1.equals(obj2)); // false (because name compared with == instead of .equals())

        // Printing hash codes of obj1 and obj2 → both return 1
        System.out.println(obj1.hashCode()); // prints 1
        System.out.println(obj2.hashCode()); // prints 1

        // Printing hash code of obj3 → returns 3
        System.out.println(obj3.hashCode()); // prints 3

        // Creating two string objects with same content
        String str1 = new String("hello"); // creates a new string "hello"
        String str2 = new String("hello"); // creates another new string "hello"

        // Comparing strings using equals() → true (checks content)
        System.out.println(str1.equals(str2)); // true

        // Printing hash codes of both strings → same because content is same
        System.out.println(str1.hashCode()); // prints same hash code
        System.out.println(str2.hashCode()); // prints same hash code
    }
}
