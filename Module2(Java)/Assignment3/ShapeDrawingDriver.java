abstract class ShapeDrawing{
	abstract void draw();
}
class Circle extends ShapeDrawing{
	int radius;
	Circle(int radius){
		this.radius=radius;
	}
	
	@Override
	public void draw(){
		System.out.println("Drawing Circle of Radius "+radius);
	}
	
}
class Rectangle extends ShapeDrawing{
	int length;
	int breadth;
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public void draw(){
		System.out.println("Drawing Rectangle of length "+length+" and breadth "+breadth);
	}
}
class ShapeDrawingDriver{
	public static void main(String[]args){
		ShapeDrawing s1 = new Circle(7);
		ShapeDrawing s2 = new Rectangle(5,10);
		
		s1.draw();
		s2.draw();
	} 
}