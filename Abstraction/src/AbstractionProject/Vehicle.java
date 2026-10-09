package AbstractionProject;

public abstract class Vehicle {

	String brand;
	double price;
	String color;
	Vehicle(){
		
	}
	
	Vehicle(String brand, double price, String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public abstract void start();
	public abstract void drive();
	
	public String toString() {
		return "Vehicle[brand=" +brand+" , Price=" +price+" , Color= "+color+ "]"; 
	}
}
