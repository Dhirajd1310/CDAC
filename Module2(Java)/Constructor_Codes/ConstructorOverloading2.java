//Constructor OverLoading 2

class ConstructorOverloading2{
	
	ConstructorOverloading2(int a){
		System.out.println("1 args int Constructor.");
	}
	
	ConstructorOverloading2(byte a){
		System.out.println("1 args byte Constructor.");
	}
	
	public static void main(String[]args){
		byte d1=10;
		ConstructorOverloading a = new ConstructorOverloading(d1);
		ConstructorOverloading b = new ConstructorOverloading(20);
	}
}


