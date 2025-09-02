class Parent{
	
	Parent(){
		super();
		System.out.println("Parent constructor.");
	}

}
class Child extends Parent{
	//used to achieve  a relationship between two classes
	Child(){
		super();//used to invoke with parent class constructor
		System.out.println("Child Class.");
	}
	
	public static void main(String[]args){
		Child a = new Child();
	}

}