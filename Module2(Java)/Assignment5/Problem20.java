import java.util.*;
class Problem20{
	public static void  main(String[]args){
		List<Integer> rollNo = new ArrayList<>();
		rollNo.add(101);
		rollNo.add(102);
		rollNo.add(103);
		rollNo.add(104);
		
		System.out.print("Enter Roll Number: ");
		Iterator<Integer> it = rollNo.iterator();
		while(it.hasNext()){
			int num = it.next();
			if(num % 2 == 0){
				System.out.print(num+ " ");
			}
		}
	}
}