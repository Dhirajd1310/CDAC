import java.util.*;
class CollectionDemo2{
	
	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		//we inherit collection properties in arraylist
		//no dimond used here
		a.add(123);
		// a is array of object
		a.add("bhagyesh");
		a.add(123.34);
		a.add(123.34);
		//System.out.println(a);
		
		Collection a1 = new ArrayList();
		//we inherit collection properties in arraylist
		//no dimond used here
		a1.add(123);
		// a is array of object
		a1.add("bhagyesh");
		a1.add(123.34);
		//System.out.println(a1);
		
		a.addAll(a1); //merging-combine a1 and a2 with duplicate also
		//runtime in value add -- dynamic 
		System.out.println(a1);
		//System.out.println(a);
		
		
		//a.remove(123);
		
		a.removeAll(a1);
		//a me a1 ke jitne element all remove
		//System.out.println(a1);
		System.out.println(a);
	
		
	}
}
