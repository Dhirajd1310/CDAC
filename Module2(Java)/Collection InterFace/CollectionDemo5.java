import java.util.*;

class CollectionDemo5 {
	
	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		// we inherit collection properties in arraylist
		// no diamond operator used here
		
		a.add(123);
		// a is array of object
		a.add("bhagyesh");
		a.add(123.34);
		a.add(123.34);
		//dynamic array a = 123 bhagyesh 123.45 123.45
		System.out.println(a);
		
		
		//second method
		Iterator it = a.iterator();
		while(it.hasNext()) //has next checks next elemet from dynamic
		{
				System.out.println(it.next());
				//pointer shifting to next element
				//4 time shifting and condition then false
		
		}
		System.out.println(a);
	}
}

/* ✅ hasNext() → Checks if more elements are available in the collection (returns true/false).
✅ next() → Returns the next element from the collection (actually fetches it).*/