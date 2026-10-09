package AbstractionProject;

public class ElectricCar extends Car{

	int batteryCapacity;
	
	ElectricCar(){
		
	}
	
	ElectricCar(String brand, double price, String color, int hp, int batteryCapacity){
		super(brand, price, color, hp);
		this.batteryCapacity=batteryCapacity;
	}
	
	@Override
	public void openGate() {
		System.out.println("Electric Car gate opened");
	}
	
	@Override
	public void start() {
		System.out.println("Electric Car started");
	}
	
	@Override
	public void drive() {
		System.out.println("Electric Car is being driven");
	}
	
	public void charge() {
		System.out.println("Electric Car is being charged");
	}
	
	@Override
	public String toString() {
		return super.toString()+ " ElectricCar[batteryCapacity= "+batteryCapacity+"]";
	}
}
