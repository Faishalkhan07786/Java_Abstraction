package ShapeProjectAbstraction;

public class Sphere implements ThreeDShape{
	double radius;
	
	Sphere(){
		
	}
	
	Sphere(double radius){
		this.radius=radius;
	}
	@Override 
	public void volume() {
		double volume= (4.0/3.0) * Math.PI * radius * radius * radius;
		System.out.println("Volume of Sphere: "+volume);
	}
	@Override
	public void lateralSurfaceArea() {
		double lateralSurfaceArea= 4 * Math.PI * radius * radius;
		System.out.println("Lateral Surface Area of Sphere is: "+lateralSurfaceArea);
	}
	@Override
	public void totalSurfaceArea() {
		double totalSurfaceArea= 4 * Math.PI * radius * radius;
		System.out.println("Total Surface Area of Sphere is: "+totalSurfaceArea);
	}
	@Override 
	public void rotate() {
		System.out.println("Sphere is rotating....");
	}
	@Override
	public String toString() {
		return "Sphere [radius= "+radius+" ]";
	}

}
