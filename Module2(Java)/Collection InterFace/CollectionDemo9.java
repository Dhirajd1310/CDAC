import java.util.*;

//like this implemet all types
class CollectionDemo9 {
	
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<>();

		//ArrayList a = new ArrayList();
		a.add("Bhagyesh");
		a.add("Chinmay");
		a.add("Sanket");
		// a is array of object
		a.add("Mohit");
		a.add("Dhiraj");
		a.add("Hey");
		// dynamic array a = [123, bhagyesh, 123.34, 123.34]
		System.out.println(a);
		
		//addition on particular  index
		//a.add(1, "Bhagyeshwani");
		//System.out.println(a);
		
		//accesing any element
	//	System.out.println("Retrive info:="+a.get(2));
		
		//modify on index
	//	a.set(2, "Keshav");
	//	System.out.println(a);
		//dhiraj to komal
		
		//remove element value //
		//a.remove("Hey") // removing hey
		//a.remove(2); //remove element value
		//System.out.println(a);
		
	//	System.out.println(a.contains("Chinmay"));
		//its contain dhiraj so print True
	//	System.out.println(a);
		
		//size of arrayList
	//	System.out.println(a.size());
		
		
	//	System.out.println(a.isEmpty());
		//false meance not Empty 
		
		//sort method belong to collection so we called collection
	//	Collections.sort(a);// alphabetical sorted
	//	System.out.println(a);
		
	//	Collection<String> subl1 = a.subList(0,7);
		//sublist making 0--1 
		//not taking 1th position cause its work in - format
	//	System.out.println(subl1);
	//	System.out.println(a);
		
	   //converting arrayList list into Arrays
	//	String[] arr = a.toArray(new String[0]);
		//string array
		//ref name arr
		//to array method
		//its static so we need to allocate  memory through new
		//System.out.println(Arrays.toString(arr));
		//converted into string 
	//	System.out.println(arr[0]);
		//clear all
		a.clear();
		System.out.println(a);
		
		
	}
}

