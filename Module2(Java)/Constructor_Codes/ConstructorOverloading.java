//Constructor OverLoading

class ConstructorOverloading{
	
	ConstructorOverloading(){
		System.out.println("No Argument Constructor.");
	}
	
	ConstructorOverloading(int a){
		System.out.println("1 args int Constructor.");
	}
	
	ConstructorOverloading(byte a){
		System.out.println("1 args byte Constructor.");
	}
	
	ConstructorOverloading(int a,int b){
		System.out.println("2 args int Constructor.");
	}
	
	public static void main(String[]args){
		ConstructorOverloading a = new ConstructorOverloading();
		ConstructorOverloading b = new ConstructorOverloading(10);
		ConstructorOverloading c = new ConstructorOverloading(20);
		ConstructorOverloading d = new ConstructorOverloading(10,20);	
	}
}