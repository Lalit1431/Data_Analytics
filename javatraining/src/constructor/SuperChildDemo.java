package constructor;

public class SuperChildDemo extends SuperParentDemo{

	String name="ABCDEFG";
	
	public void getStringdata() {
		System.out.println(name);
		System.out.println(super.name);
	}
	public void getData() {
		super.getData();
		System.out.println("I am child data");
	}
	public SuperChildDemo(){
		super();
		System.out.println("I am child constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperChildDemo cd=new SuperChildDemo();
		//cd.getData();
				
	}

}
