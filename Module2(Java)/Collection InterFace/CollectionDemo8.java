import java.util.*;

class CollectionDemo8 {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		// we inherit collection properties in arraylist
		// no diamond operator used here
		
		a.add(123);
		// a is array of object
		a.add("bhagyesh");
		a.add(123.34);
		a.add(123.34);
		// dynamic array a = [123, bhagyesh, 123.34, 123.34]
		System.out.println(a);
		
		// Object obj : access by index
		// get element at index 1 → bhagyesh
		//Object obj ;
	    System.out.println(a.get(1));
		
	/*	
		// Third method → Using ListIterator -- traverse array
		ListIterator lit = ((ArrayList)a).listIterator();
		
		// forward direction (with modification)
		System.out.println("Forward (with set)");
		while(lit.hasNext()) {
			Object obj1 = lit.next();
			System.out.println(obj1);
			
			// replace current element with "111" for all obj
			lit.set("Dhiraj");
		}
		
		// backward direction
		System.out.println("Backward");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		// final updated list
		System.out.println("Updated List: " + a);*/
	}
}


//suppose we get 1 and so its replace only one