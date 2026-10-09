package ShapeProjectAbstraction;

public class Rectangle implements TwoDShape{
			double length;
			double width;
			
			Rectangle(){
				
			}
			Rectangle(double length, double width){
				this.length=length;
				this.width=width;
			}
			@Override
			public void area() {
				double area = length*width;
				System.out.println("Area of Rectangle: "+area);
			}
			@Override
			public void perimeter() {
				double perimeter = 2*(length + width);
				System.out.println("Perimeter of Rectangle: "+perimeter);
			}
			@Override
			public void rotate() {
				System.out.println("Rotating the Rectangle...");
			}
			@Override
			public String toString() {
				return "Rectangle [length=" +length+", width= "+width+" ]";
			}

}
