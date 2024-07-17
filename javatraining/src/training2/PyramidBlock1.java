package training2;

public class PyramidBlock1 {

	public static void main(String[] args) {
	int k=1;
	for (int i=0; i<4;i++) {
		//System.out.println("outerloop started");
		for (int j=0;j<4-i;j++) {
			System.out.print(k +"\t");
			k++;
		}
		System.out.println("");
	}
	}

}
