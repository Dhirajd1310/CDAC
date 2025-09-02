class TeaCup{
	 static String teaType;
	 private static int totalCups;
	 
	 public TeaCup(String teaType){
		 this.teaType=teaType;
		 totalCups++;
	 }
	 
	 public String getTeaType(){
		 return teaType;
	 }
	 
	 public static void showTotalCups(){
		 System.out.println("Total cups made: "+ totalCups);
	 }
}

class TeaCupDriver{
	 
	 public static void main(String[] args){
		 TeaCup Cup1 = new TeaCup("Masala Tea");
		 TeaCup Cup2 = new TeaCup("Green Tea");
		 TeaCup Cup3 = new TeaCup("Ginger Tea");
		 
		 System.out.println("Cup1 type: "+Cup1.getTeaType());
		 System.out.println("Cup2 type: "+Cup2.getTeaType());
		 System.out.println("Cup3 type: "+Cup3.getTeaType());
		 
		 TeaCup.showTotalCups();
	 }

}