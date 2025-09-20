

class Arms{
	public static void main(String [] args){
		
		int num=153;
		
		int d1 = (num%10);
		int d2 = ((num/10)%10);
		int d3 = (num/100);
		
		int cube1 = (d1*d1*d1);
		int cube2 = (d2*d2*d2);
		int cube3 = (d3*d3*d3);
		
		int sum = (cube1+cube2+cube3);
		
		if(sum == num ){
			System.out.println(sum+" is armstrong number.");
		} else {
			System.out.println(sum+" is not a armstrong number.");
		}
	}
}
