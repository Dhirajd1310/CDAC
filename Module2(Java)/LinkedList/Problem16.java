import java.util.HashMap;
import java.util.Map;

class Problem16{
	public static void main(String[]args){
		Map<String,Integer> student = new HashMap<>();
		student.put("Amit",85);
		student.put("Priya",52);
		student.put("Rohan",78);
		
		int threshold = 60;
		
		System.out.println("Honnor Roll:");
		
		for(Map.Entry<String,Integer>entry:student.entrySet()){
			if(entry.getValue() >= threshold){
				System.out.println(entry.getKey() +" : "+ entry.getValue());
			}
		}
	}
}