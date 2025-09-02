class ArrayStudy{
	public static void main(String[]args){
		int[] calArray=new int[5];
		float[] salArray={20.2f,50.3f,13.7f,98.6f};
		System.out.println(calArray.length);
		System.out.println(salArray.length);
		
		for(int i=0;i<salArray.length;i++){
			System.out.println(salArray[i]);
		}
		for(float elements:salArray){
			System.out.println(elements);
		}
	}
}