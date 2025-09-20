import java.util.*;


class Problem15{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		Map<String, Integer> Library = new HashMap<>();
		
		Library.put("Java",3);
		Library.put("Python",5);
		Library.put("C",3);
		Library.put("C++",5);
		
		System.out.println("Initial Library: "+Library);
		System.out.println("Enter Book name to Borrow: ");
		String book = sc.nextLine();
		
		if(Library.containsKey(book)){
			int copies = Library.get(book);
			{
			if(copies>0){
					Library.put(book , copies-1);
				System.out.println("Book borowed Successfully");
			}
				else{
					System.out.println("No copies available for"+book);
				}
			}
		}
		else{
			System.out.println("Book not founnd");
		}
		System.out.println("Current Library : "+Library);
	}
}