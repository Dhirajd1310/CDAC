class Parent{
	public int age=50;
	public String name="papa";
	public void print(){
		System.out.println(age + name);
	}
}

public class Child{
	public static void main(String[]args){
		Parent objParent=new Parent();
		System.out.println(objParent.name);
		System.out.println(objParent.age);
		objParent.print();
	}
}
