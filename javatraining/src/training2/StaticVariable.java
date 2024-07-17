package training2;

public class StaticVariable {

	String name;
	String address;
	static String City;
	static int i;
	static {
		City="Banglore";
		i=0;
	}
	
	StaticVariable(String name,String address){
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
	}
	public void getAddress() {
		System.out.println(address);
	}
	public static void getCity() {
		System.out.println(City);
	}
	
	public static void main(String[] args) {
		StaticVariable obj=new StaticVariable("Lalit", "Wadki");
		StaticVariable obj1=new StaticVariable("Lalit", "Wadkinala");
		obj.getAddress();
		obj1.getAddress();
		StaticVariable.getCity();
	}

}
