class Details{
		int age_Of_Father=48;
		int age_Of_Mother=42;
		
		float height_Of_Father=181.4f;
		float height_Of_Mother=172.1f;
		
		String name_Of_Father="Divakar";
		String name_Of_Mother="Nanda";
		
		public void print(){
			System.out.println(name_Of_Father+" "+age_Of_Father+" "+height_Of_Father);
			System.out.println(name_Of_Mother+" "+age_Of_Mother+" "+height_Of_Mother);
		}
}

class Family {
	public static void main(String args[]){
		Details objDetails = new Details();
		
		objDetails.print();
	}
}