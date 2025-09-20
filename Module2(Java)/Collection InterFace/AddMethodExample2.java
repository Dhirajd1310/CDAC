import java.util.*;
class AddMethodExample2{
	@SuppressWarnings("Unchecked")
	public static void main(String[]args){
		Collection coll = new TreeSet();
		System.out.println(coll.add(1));
		System.out.println(coll.add(3));
		System.out.println(coll.add(2));
		System.out.println(coll);
	}
}
