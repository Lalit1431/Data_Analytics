package javatraining;

public class Animal {
	
	String color;
	int Age;
	
	public void initObj(String c,int a) {
		color=c;
		Age=a;
	}
	public void display() {
		System.out.println("My  color is "+ color +" "+ "and my age is "+Age);
	}
	public static void main(String[] args) {

		Animal mangi=new Animal();
		mangi.initObj("black", 10);
		mangi.display();
	}

}
