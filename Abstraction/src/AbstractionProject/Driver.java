package AbstractionProject;

public class Driver {

	public static void main(String[] args) {
		Vehicle v=new ElectricCar("Tesla", 750000, "Black", 500, 100);
		System.out.println(v);
		v.start();
		v.drive();
		
		Car c=(Car)v;  //downCast to access the Car-specific methods
		c.openGate();
		
		ElectricCar ec=(ElectricCar)c;     //downCast to access the ElectricCar-specific methods
		ec.charge();
	}
}
