import java.util.*;

class CollectionDemo3 {
	
	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		// we inherit collection properties in arraylist
		// no diamond operator used here
		
		a.add(123);
		// a is array of object
		a.add("Dhiraj");
		a.add(789.00);
		a.add(123.34);
		a.add("Hello");
		System.out.println(a);
		
		Collection a1 = new ArrayList();
		// we inherit collection properties in arraylist
		// no diamond operator used here
		
		a1.add(765);
		// a1 is array of object
		a1.add("bhagyesh");
		a1.add(135.64);
		a1.add("Mohit");
		a1.add(123.34);
		a1.add("Hello");
		System.out.println(a1);
		
		// merging - combine a1 into a (duplicates allowed)
		// runtime value add -- dynamic
		//a.addAll(a1); 
		//System.out.println(a1);
		//System.out.println(a);
		
		// for understanding
		//System.out.println("--------");
		
		// a.remove(123); // (optional) removes one occurrence of 123
		//a.removeAll(123);
		
		// retainAll → keeps only common elements of a and a1
		System.out.println("--------");
		//a.retainAll(a1);  
		a1.retainAll(a); 
		// common elements
		System.out.println(a);
		System.out.println(a1);
	}
}
