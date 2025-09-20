import java.util.*; 

class Student { 
    int sid; 
    String sname; 
    long contact; 
    String graduation; 
    String branch; 
    int yop; 
    double cgpa; 

    public Student(int sid, String sname, long contact, String graduation, 
                   String branch, int yop, double cgpa) { 
        super(); 
        this.sid = sid; 
        this.sname = sname; 
        this.contact = contact; 
        this.graduation = graduation; 
        this.branch = branch; 
        this.yop = yop; 
        this.cgpa = cgpa; 
    } 

    @Override 
    public String toString() { 
        return "sid = " + sid + 
               ", sname = " + sname + 
               ", contact = " + contact + 
               ", graduation = " + graduation + 
               ", branch = " + branch + 
               ", yop = " + yop + 
               ", cgpa = " + cgpa; 
    } 
} 


class SortById implements Comparator<Student> { 
    @Override 
    public int compare(Student s1, Student s2) { 
        if (s1.sid > s2.sid) 
            return 1; 
        else if (s1.sid < s2.sid) 
            return -1;   
        else  
            return 0; 
    } 
} 

class Example2Comparator { 
    public static void main(String[] args) { 
        ArrayList<Student> list = new ArrayList<Student>(); 
        
        list.add(new Student(3, "RAMESH", 9876543210L, "BE", "CIVIL", 2024, 9.7)); 
        list.add(new Student(4, "SURESH", 8876543210L, "BE", "MECHANICAL", 2024, 8.7)); 
        list.add(new Student(2, "GANESH", 7876543210L, "BE", "ELECTRICAL", 2023, 7.9)); 
        list.add(new Student(6, "RAJESH", 6876543210L, "BE", "MECHANICAL", 2024, 9.1)); 
        list.add(new Student(5, "ANIMESH", 5876543210L, "BE", "CIVIL", 2022, 9.3)); 
        list.add(new Student(1, "MUKESH", 4876543210L, "BE", "ELECTRONICS", 2023, 8.7)); 
        list.add(new Student(7, "KAMLESH", 3876543210L, "BE", "ELECTRICAL", 2023, 6.7)); 
        
        Collections.sort(list, new SortById()); 
        
        ListIterator<Student> li = list.listIterator(); 
        while (li.hasNext()) { 
            System.out.println(li.next()); 
        } 
    } 
} 

/*
sid = 1, sname = MUKESH, contact = 4876543210, graduation = BE, branch = ELECTRONICS, 
yop = 2023, cgpa = 8.7 
sid = 2, sname = GANESH, contact = 7876543210, graduation = BE, branch = ELECTRICAL, 
yop = 2023, cgpa = 7.9 
sid = 3, sname = RAMESH, contact = 9876543210, graduation = BE, branch = CIVIL, yop = 
2024, cgpa = 9.7 
sid = 4, sname = SURESH, contact = 8876543210, graduation = BE, branch = MECHANICAL, 
yop = 2024, cgpa = 8.7 
sid = 5, sname = ANIMESH, contact = 5876543210, graduation = BE, branch = CIVIL, yop = 
2022, cgpa = 9.3 
sid = 6, sname = RAJESH, contact = 6876543210, graduation = BE, branch = MECHANICAL, 
yop = 2024, cgpa = 9.1 
sid = 7, sname = KAMLESH, contact = 3876543210, graduation = BE, branch = ELECTRICAL, 
yop = 2023, cgpa = 6.7 

*/
