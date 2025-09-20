import java.util.*;
class Student  {
	int rollNumber;
	String name;
	String department;
	double cgpa;
	
	Student(int rollNumber,String name,String department,double cgpa){
		this.rollNumber=rollNumber;
		this.name=name;
		this.department=department;
		this.cgpa=cgpa;
	}
	    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNumber;
    }

    public void setRollNo(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setName(double cgpa) {
        this.cgpa = cgpa;
    }
	
	@Override
	public String toString(){
		return rollNumber+":"+name+":"+department+":"+cgpa;
	}
	
	public int compare(Student s1,Student s2){
		return Double.compare(s2.cgpa,s1.cgpa);
	}
	
}

class sortByName implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2){
		return s1.name.compareTo(s2.name);
	}
}
class sortByRollno implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2){
		return Integer.compare(s1.rollNumber,s2.rollNumber);
	}
}
class Project{
	public static void main(String[]args){
		// 1. Registration list (ArrayList)
        // Students added in order of registration
		
		List<Student> s = new ArrayList<>();
		s.add(new Student(101,"Amit","CS",8.5));
		s.add(new Student(102,"Priya","Math",9.2));
		s.add(new Student(103,"Rohan","CS",7.8));
		s.add(new Student(104,"Sneha","Physics",4.5));
		
		 System.out.print("Registration Order: ");
		for (Student stdList : s) {
            System.out.print(stdList.getName()+ ",");
        }
		
		System.out.println();
		System.out.println("--------------------------");
		// 2. Merit List - sort by CGPA descending
		Collections.sort(s,new sortBycgpa());
		System.out.print("Merit List: ");
		for(Student stu :s){
			System.out.print(stu.getName()+"("+stu.getCgpa()+")");
		}
		System.out.println();
		System.out.println("--------------------------");
		// 3. Alphabetical List - sort by name using Comparator
		Collections.sort(s,new sortByName());
		System.out.print("Alphabetical: ");
		for(Student stu :s){
			System.out.print(stu.getName()+" ");
		}
		
		System.out.println();
		System.out.println("--------------------------");
		// 4. Group students by department using HashMap
		Map<String,List<Student>> deptmap = new HashMap<>();
		for(Student stu : s){
			List<Student> deptList = deptmap.getOrDefault(stu.department,new ArrayList<>());
			deptList.add(stu);
			
			deptmap.put(stu.department,deptList);
		}
		System.out.println("Department Groups: ");
		for(String dept : deptmap.keySet()){
			System.out.print(dept+": [ ");
			List<Student> deptStud = deptmap.get(dept);
			Iterator<Student>it=deptStud.iterator();
			while(it.hasNext()){
				System.out.print(it.next().name);
				if(it.hasNext()){
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
		System.out.println();
		
		// 5. Unique names using HashSet
		Set<String> uniqueName = new HashSet<>();
		for(Student stu : s){
			uniqueName.add(stu.name);
		}
		
		System.out.println("Unique Students Name: ");
		for(String name : uniqueName ){
			System.out.print(name+" ");
		}
		System.out.println();
		
		// 6. Roll number sorting using TreeSet
		Set<Student> Rollno = new TreeSet<>(new sortByRollno());
		Rollno.addAll(s);
		System.out.println("Roll No :");
		for(Student stu :Rollno){
			System.out.print(stu+" ");
		}
		System.out.println();
		
		// 7. Performance filter using Iterator
		Iterator<Student> it = s.iterator();
		while(it.hasNext()){
			Student stu = it.next();
			if(stu.cgpa<5.0){
				it.remove();
			}
		}
		System.out.println("Qulified students with (cgpa>=5)");
		for(Student stu : s){
			System.out.print(stu+" ");
		}
		System.out.println();
		
		// 8. Recent registrations using Stack (LIFO)
		Stack<Student> regiStu = new Stack<>();
		
		for(Student stu : s){
			regiStu.push(stu);
		}
		
		for(Student stu :regiStu){
			System.out.print(stu+" ");
		}
		
		if(!regiStu.isEmpty()){
			System.out.println("Last Registration : "+ regiStu.peek());
		}
		
		if(!regiStu.isEmpty()){
			Student removed = regiStu.pop();
			System.out.println("Removed Last Registration : "+ removed);
		}
		System.out.println();
		
		// 10. Hostel applications using Deque (LinkedList)
		Deque<Integer> hostel = new LinkedList<>();
		
		hostel.addFirst(101);
		
		hostel.addLast(105);
		
		System.out.print("Hostel Queue: "+hostel+" ");
		
		if(!hostel.isEmpty()){
			int allocateFront = hostel.removeFirst();
			System.out.println("Allocated from front :"+ allocateFront);
		}
		
		System.out.println("Hostel Queue after allocation : "+hostel);
	}
}