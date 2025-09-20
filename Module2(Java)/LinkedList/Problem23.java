import java.util.*;

class Problem23{
	public static void main(String[]args){
		Deque<String> BrowserHistroy = new ArrayDeque<>();
		
		BrowserHistroy.add("Google");
	    BrowserHistroy.add("YouTube");
		BrowserHistroy.add("GFG");
		
		BrowserHistroy.pollLast();
		System.out.print("Cuurent Histroy :"+ BrowserHistroy);
	}
}