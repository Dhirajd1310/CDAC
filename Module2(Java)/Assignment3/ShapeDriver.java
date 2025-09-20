 abstract class Shape{
	abstract double area();
}

class Rectangle extends Shape{
	private double length ;
	private double breadth ;
	
	Rectangle(double length,double breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double area(){
		return length * breadth ;
	}
}

class Circle extends Shape {
	private double radius;
	 Circle (double radius){
		 this.radius=radius;
	 }
	 
	 @Override
	 public double area(){
		 return Math.PI * radius *radius;
	 }

}

class ShapeDriver{
	public static void main(String[]args){
		
		Shape r = new Rectangle(5,10);
		System.out.println("Rectangle area is : "+r.area());
		
		Shape c = new Circle(7);
		System.out.println("Circle area is : "+c.area());
	}

}