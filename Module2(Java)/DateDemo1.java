import java.util.*;

class DateDemo1{
	public static void main(String[]args){
		Calendar cal = Calendar.getInstance();
		System.out.println("Year = "+cal.get(Calendar.YEAR));
		System.out.println("Month = "+(cal.get(Calendar.MONTH)+1));//0-based index
		System.out.println("Day = "+cal.get(Calendar.DAY_OF_MONTH));
		
		cal.add(Calendar.DAY_OF_MONTH,7);
		System.out.println("After 7 days :"+ cal.getTime());
		
	}

}