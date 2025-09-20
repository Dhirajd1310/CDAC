import java.util.*;

class CollectionDemo6 {
	
	public static void main(String[] args) {
		
			Collection a = new ArrayList();
		// we inherit collection properties in arraylist
		// no diamond operator used here
		
		a.add(123);
		// a is array of object
		a.add("bhagyesh");
		a.add(123.34);
		a.add(123.34);
		// dynamic array a = [123, bhagyesh, 123.34, 123.34]
		System.out.println(a);
		
		// Third method → Using ListIterator
		ListIterator lit = ((ArrayList)a).listIterator();
		
		// forward directin
		System.out.println("Forward");
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		
		// backward direction
		System.out.println("Backward");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		System.out.println(a);
	}
}

