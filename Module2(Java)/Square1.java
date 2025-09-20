class Shapes {
	float area = 238.78f;
	float diameter=2.3f;
}

class Square extends Shapes{
	 int size =4 ;
	 int height = 20;
	 int width=20;

}
class Square1{
	public static void main(String[]args){
		Square a = new Square();
		System.out.println("Square info.");
		System.out.println(a.area);
		System.out.println(a.diameter);
		System.out.println(a.size);
		System.out.println(a.height);
		System.out.println(a.width);
	}
 }