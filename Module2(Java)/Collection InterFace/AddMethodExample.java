import java.util.*;
class AddMethodExample{
	@SuppressWarnings("Unchecked")
	public static void main(String[]args){
		Collection coll = new ArrayList();
		System.out.println(coll);
		for(int i=10;i<=100;i+=10){
			coll.add(i);
		}
		System.out.println(coll);
	}
}