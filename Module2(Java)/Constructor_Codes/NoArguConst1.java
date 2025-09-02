class NoArguConst1{
	public NoArguConst1()
	{
		System.out.println("Public : No argument Constructor.");
	}
	
	protected NoArguConst1()
	{
		System.out.println("protected : No argument Constructor.");
	}
	
	NoArguConst1()
	{
		System.out.println("Default : No argument Constructor.");
	}
	
	private NoArguConst1()
	{
		System.out.println("private: No argument Constructor.");
	}
	
	public static void main(String[]args){
		NoArguConst1 a =  new NoArguConst1();
	}

}

//ERROR :CTE,(some const name is used)instead of these we can use different formal arguments