import java.util.*;

class Problem25{
	public static void main(String[]args){
		Deque<String> commands = new LinkedList<>();
		
		int limitOfCoomand=3;
		
		String[] enterCommand = {"ls","pwd","cd..","mkdir"};
		
		for(String cmd : enterCommand){
			if(commands.size() >= limitOfCoomand){
				commands.pollFirst();
			}
			commands.add(cmd);
		}
		System.out.println("Recent Searches: "+String.join(",",commands));
	}
}
