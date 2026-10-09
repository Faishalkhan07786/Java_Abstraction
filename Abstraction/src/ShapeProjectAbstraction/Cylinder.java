package ShapeProjectAbstraction;

public class Cylinder implements ThreeDShape{
			double radius;
			double height;
			
			Cylinder(){
				
			}
			
			Cylinder(double radius, double height){
				this.radius=radius;
				this.height=height;
			}
			@Override
			public void volume() {
				double volume= Math.PI * radius * radius * height;
				System.out.println("Volume of Cylinder is: "+volume);
			}
			@Override
			public void lateralSurfaceArea() {
				double lateralSurfaceArea= 2 * Math.PI * radius * height;
				System.out.println("Lateral Surface Area of Cylinder is: "+lateralSurfaceArea);
			}
			@Override
			public void totalSurfaceArea() {
				double totalSurfaceArea= 2 * Math.PI * radius * (radius+height);
				System.out.println("Total Syrface Area of Cylinder is: "+totalSurfaceArea);
			}
			@Override
			public void rotate() {
				System.out.println("Rotating the Cylinder...");
			}
			@Override
			public String toString() {
				return "Cylinder [radius= "+radius+" height= "+height+" ]";
			}

}
