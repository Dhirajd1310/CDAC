import java.util.*;

class Problem9{
	public static void main(String[]args){
		Set<String> str = new HashSet<>();
		
		str.add("Amit");
		str.add("Rohan");
		str.add("Amit");
		str.add("Priya");
		
		System.out.println("Total Unique attendance: "+str.size());
	}
}

		