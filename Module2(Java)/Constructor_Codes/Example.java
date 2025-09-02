class Example{
	int x=10;
	
	public static void main(String[]args){
		Example e = new Example();
		Example e1 = new Example();
		Example e2 = new Example();
		System.out.println(e);
		System.out.println(e1);
		e=e1;
		System.out.println(e);
		e1=e2;
		System.out.println(e2);
		System.out.println(e1);
		e2=null;
		System.out.println(e2);
		
	}
}