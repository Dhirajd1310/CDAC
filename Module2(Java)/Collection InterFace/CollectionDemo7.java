import java.util.*;

class CollectionDemo7{
	
	public static void main(String[] args) {
		
		List a = new ArrayList();
		// we inherit collection properties in arraylist
		// no diamond operator used here
		
		a.add(123);
		// a is array of object
		a.add("bhagyesh");
		a.add(123.34);
		a.add(123.34);
		// dynamic array a = [123, bhagyesh, 123.34, 123.34]
		System.out.println(a);
		
		//Object obj : access by index
		//get first index by 1 bhagyesh on 1st 123 on 0
	//	Object obj = a.get(1);
	//	System.out.println(obj);
		
		
		// Third method → Using ListIterator-- traverse array
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
