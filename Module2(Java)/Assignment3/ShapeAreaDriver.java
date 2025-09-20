class ShapeArea{
	
	public int calculateArea(int side ){
		return side * side ;
	}
	
	public int calculateArea(int length , int breadth){
		return length*breadth;
	}
	public double calculateArea(double radius){
		return 3.14*radius*radius;
	}
}

class ShapeAreaDriver{
	public static void main(String[]args){
		ShapeArea Shape = new ShapeArea();
		
		int squareArea = Shape.calculateArea(5);
		System.out.println("Square Area = "+ squareArea);
		
		int rectangleArea = Shape.calculateArea(4,6);
		System.out.println("Rectangle Area = "+ rectangleArea);
		
		double circleArea = Shape.calculateArea(3.0);
		System.out.println("Circle Area = "+ circleArea);
	}
}