package training2;

public class ChilldAircraft extends Aircraft {

	public static void main(String[] args) {
		ChilldAircraft ca=new ChilldAircraft();
		ca.engine();
		ca.safety();
		ca.bodyColor();
	}

	@Override
	public void bodyColor() {
		System.out.println("body color is red");
		
	}

}
