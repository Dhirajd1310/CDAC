import java.util.*;

class CollectionDemo4 {
	
	public static void main(String[] args) {
		
		Collection a = new ArrayList();
		// we inherit collection properties in arraylist
		// no diamond operator used here
		
		a.add(123);
		// a is array of object
		a.add("bhagyesh");
		a.add(123.34);
		a.add(123.34);
		System.out.println(a);
		
		
		//for each loop method
		for(Object obj : a) {
		//collection traverse visit  each element and print
			System.out.println(obj);
		//its heterogenos data  like mix int string double 
		
			
		}
	}
}