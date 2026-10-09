package ShapeProjectAbstraction;

public interface Shape {
	void rotate();
	
	default void move() {
		System.out.println("Moving the shpe..");
		holdAndPress();
	}
	
	default void resize() {
		System.out.println("Resizing the shape..");
		holdAndPress();
	}
	
	public static void zoomIn() {
		System.out.println("zoom in shape");
		press();
	}
	
	public static void zoomOut() {
		System.out.println("zoom out shape");
		press();
	}
	
	private void holdAndPress() {
		System.out.println("Hold and press the shape");
	}
	
	private static void press() {
		System.out.println("Press the shape");
	}
}
