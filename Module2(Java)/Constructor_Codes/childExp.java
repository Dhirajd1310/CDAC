//Constructor Chaining

class Parent{
	Parent(){
		super();//object class Constructor
		System.out.println("Parent Constructor");
	}
}

class childExp extends Parent{
	childExp(){
		super();
		System.out.println("From child Constructor");
	}
	public static void main(String[]args){
		childExp a = new childExp();
	}
}