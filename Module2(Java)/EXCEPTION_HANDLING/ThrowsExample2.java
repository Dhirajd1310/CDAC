class ThrowsExample2{ 
public static void main(String[] args) throws InterruptedException{
	String name = "Hello Mohit"; 
	for(int i=0;i<name.length();i++){ 
	System.out.println(name.charAt(i)); 
	Thread.sleep(5000); 
	} 
 }
}