import java.util.*;
class Program19{
	public static void main(String[]args){
		Map<String,Integer> grade = new LinkedHashMap<>();
		
		grade.put("Amit",85);
		grade.put("Priya",92);
		grade.put("Dhiraj",92);
		
		System.out.print("Grade Report:");
		Iterator<Map.Entry<String,Integer>> it = grade.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, Integer> entry = it.next();
            System.out.print(entry.getKey() + ":" + entry.getValue());
			if (it.hasNext()) {
                System.out.print(", ");
			}
		}
	}
}  