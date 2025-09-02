class ArrayRealExample{
	public static void main(String[]args){
		double[] heights ={5.11,5.3,6.0,5.2,4.7,5.4,4.9,5.0,6.1,5.5};
		int countOfStudents = heights.length;
        double sum=0;	
		 for(int i=0;i<heights.length;i++){
			 sum+=heights[i];
		 }
		 double avg = sum/countOfStudents;
		 System.out.println(avg);
	}	 
}