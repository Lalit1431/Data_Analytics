package constructor;

public class ConsructDemo {
	public ConsructDemo(){
		System.out.println("I am constructor");
		
		
	}
	public ConsructDemo(int a,int b){
		System.out.println("I am parameterised constructor");
		
		
	}
	
	
	public void getData() {
		System.out.println("i am get data method");
	}
	public static void main(String[] args) {
		ConsructDemo cd=new ConsructDemo(5,7);
	}

}
