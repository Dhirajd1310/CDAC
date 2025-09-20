class Student{
	int id;
	String name;
	String edu;
	int yop;
	
	Student(int id , String name,String edu,int yop){
		this.id=id;
		this.name=name;
		this.edu=edu;
		this.yop=yop;
	}
	@Override
	public String toString(){
		return "id: "+id+", Name:"+name+",Education:"+edu+",Yop:"+yop;
	}
}

class ExampleToString{
	public static void main(String[]args){
		Student obj1 = new Student(1,"Dhiraj","BE",2024);
		Student obj2 = new Student(2,"Patil","BE",2025);
		System.out.println(obj1);
		System.out.println(obj2);
	}
}