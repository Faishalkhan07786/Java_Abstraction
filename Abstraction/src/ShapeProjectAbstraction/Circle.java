package ShapeProjectAbstraction;

public class Circle implements TwoDShape{

	double radius;
	
	Circle(){
		
	}
	Circle(double radius){
		this.radius=radius;
	}
	@Override
	public void area() {
		double area=Math.PI * radius * radius;
		System.out.println("Area of the Radius is: "+area);
	}
	@Override
	public void perimeter() {
		double perimeter= 2 * Math.PI * radius;
		System.out.println("Perimeter of the circle: "+perimeter);
	}
	@Override
	public void rotate() {
		System.out.println("Circle is Rotating....");
	}
	@Override
	public String toString() {
		return "Circle [radius= "+radius+" ]";
	}
}
