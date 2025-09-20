import java.util.*;

class Problem21{
	public static void main(String[]args){
		Deque<String> text = new ArrayDeque<>();
		
		text.push("Type A");
	    text.push("Type B");
		text.push("Delete");
		 
		if(!text.isEmpty()){
			text.pop();
		}
		
		System.out.print("Cureent actions: ");
		
		Iterator<String> it = text.descendingIterator();
		while(it.hasNext()){
			System.out.print(it.next());
			if(it.hasNext()){
				System.out.print(", ");
			}
		}
	}
}