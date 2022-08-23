package view;
abstract class Shape{
	double area;
	Shape(){
		System.out.println("Shape constructor");
	}
	void displayShape(String shapeName) {
		System.out.println("I am a "+shapeName);
	}
	abstract double calculateArea();
}
abstract class Polygon extends Shape{
	
}
abstract class NonPolygon extends Shape{
	
}
class Rectangle extends Polygon{
	double length,breath;
	
	Rectangle(double length, double breath){
		this.length=length;
		this.breath=breath;
	}
	double calculateArea() {
		return length*breath;
	}
	
	
}
class Square extends Polygon{
	double calculateArea() {
		return 12;
	}
}
class Circle extends NonPolygon{
	double radius;
	Circle(double radius){
		this.radius=radius;
	}
	double calculateArea() {
		return 3.14*radius*radius;
	}
}
public class Main {

	public static void main(String[] args) {
		Rectangle rectangle=new Rectangle(5.1, 2.10);	
		rectangle.displayShape("Rectangle");
		System.out.println("Area="+rectangle.calculateArea());
		Circle circle=new Circle(2.4);
		circle.displayShape("Circle");
		System.out.println("Area="+circle.calculateArea());
		
		
		

	}

}
