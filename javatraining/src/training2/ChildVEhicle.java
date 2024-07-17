package training2;

public class ChildVEhicle extends ParentVehicle {

	public void engine() {
		System.out.println("engine are implemented");
	}
	public void color() {
		System.out.println(color);
	}
	public void gear() {
		System.out.println("new gear implemented");
	}
	public static void main(String[] args) {
	ChildVEhicle ce=new ChildVEhicle();
	ce.color();
	ce.gear();
	}

}
