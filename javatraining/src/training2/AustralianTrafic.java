package training2;

public class AustralianTrafic implements CentalTraffic,ContinentalTraffic {

	public static void main(String[] args) {
		AustralianTrafic c1=new AustralianTrafic();
		c1.gogreen();
		c1.stopred();
		c1.flashyellow();
		c1.fly();
		c1.swim();
		
	
	
	}

	@Override
	public void gogreen() {
		System.out.println("Walking");
		
	}

	@Override
	public void stopred() {
		System.out.println("Stop");		
	}

	@Override
	public void flashyellow() {
		System.out.println("Look Above");
	}
	
	public void fly() {
		System.out.println("I am flying");
	}

	@Override
	public void swim() {
		System.out.println("i am Swimming");
	}

}
