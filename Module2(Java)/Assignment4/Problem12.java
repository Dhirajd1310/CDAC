
//Problem 12: Remove Extra Text 
class Problem12{
	public static void main(String[]args){
		String text = "Please read - Do not Distrub";
		String remove = "- Do not Distrub";
		
		StringBuilder sb = new StringBuilder(text);
		
		int start = sb.indexOf(remove);
		
		if(start != -1){
			sb.delete(start,start+remove.length());
		}
		System.out.println("Final Message:"+sb.toString().trim());
	}
}