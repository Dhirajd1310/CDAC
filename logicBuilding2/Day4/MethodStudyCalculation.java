class MethodStudyCalculation{
	
	void calculateTDSDeductions(){
		int tds=20;
		float sal=50000;
		System.out.println("Your TDS is Deducted!"+sal/tds);
	}
	
	void calculateSalaryDeductions(){
		System.out.println("Your Salary is Deducted!");
	}
	
	public static void main(String[]args){
		
		MethodStudyCalculation objCal = new MethodStudyCalculation();
		
		objCal.calculateSalaryDeductions();
		objCal.calculateTDSDeductions();
		
	}
}