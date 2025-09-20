import java.util.*;

class Problem10{
	public static void main(String[]args){
		Set<Integer> id = new HashSet<>();
		
		id.add(201);
		id.add(202);
		id.add(203);
		id.add(202);
		
		System.out.println("Total Valid Voters: "+id.size());
	}
}

		