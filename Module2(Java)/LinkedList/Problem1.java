import java.util.*;
class Problem1{
	public static void main(String[]args){
		List<String> list = new ArrayList<>();
		
		list.add("Amit");
		list.add("Priya");
		list.add("Rohan");
		
		System.out.println("Students List: "+list);
		
		String isRemoverd = list.remove(1);
		System.out.println("Students: "+list);
		//System.out.println("Removed Student: "+ isRemoverd);
	}
}