//method overloading

class MethodOverloading{
	
	public static void m1(){
		System.out.println("m1() no args ");
	}
	
	public static void m1(int a){
		System.out.println("m1()one args ");
	}
	
	public static void m1(int a ,int b){
		System.out.println("m1() two args ");
	}
	
	public static void main(String[]args){
		m1();
		m1(10);
		m1(20,30);
		
	}
}