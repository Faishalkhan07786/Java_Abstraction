package AbstractionProject;

public abstract class Car extends Vehicle{

	int hp;
	
	Car(){
		
	}
	Car(String brand, double price, String color, int hp){
		super(brand, price, color);
		this.hp=hp;
	}
	
	public abstract void openGate();
	
	@Override
	public String toString() {
		return super.toString()+ " Car[hp= "+hp+"]";
	}
}
