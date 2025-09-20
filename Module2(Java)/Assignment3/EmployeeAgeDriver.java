class EmployeeAge{
	private int age;
	
	public void setAge(int age){
		if(age>=18){
			this.age=age;
			System.out.println(age+" You are eligible ");
		}else {
			System.out.println("Invalid age ");
		}
	}
	public int getAge(){
		return age;
	}
}
class EmployeeAgeDriver{
	public static void main(String[]args){
		EmployeeAge e1 = new EmployeeAge();
		e1.setAge(17);
		System.out.println("Age is: "+ e1.getAge());
		e1.setAge(25);
		System.out.println("Age is Set to : "+ e1.getAge());
	}
}