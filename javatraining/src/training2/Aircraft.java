package training2;

public abstract class Aircraft {

	public void engine() {
		System.out.println("Engine Attached");
	}
	public void safety() {
		System.out.println("engine is safe");
	}
	
	public abstract void bodyColor();
}
