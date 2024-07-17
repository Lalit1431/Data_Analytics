package training2;

public class MethodOverloading {

	public void getdata(int a) {
		System.out.println(a);
	}
	public void getdata(String a) {
		System.out.println(a);
	}
	public void getdata(int a,int b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.getdata(8);
		m.getdata("TExt");
		m.getdata(0, 10);

	}

}
