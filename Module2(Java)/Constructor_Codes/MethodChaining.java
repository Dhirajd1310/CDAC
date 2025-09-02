
//Method Chaining

class MethodChaining{
	
	public static void m1(){
		System.out.println("m1()");
		m2(10);
	}
	 
	public static void m2(int a){
		System.out.println("m2(int a)");
		m3('c');
	}
	
	public static void m3(char ch){
		System.out.println("m3(char ch)");
	}	
	
	public static void main(String[]args){
		m1();
	}
}