package training2;

public class PyramindBlock2 {

	public static void main(String[] args) {
		int k=1;
		for (int i=1; i<=4;i++) {
	//		System.out.println("outer loop started" +i);
			for (int j=0; j<i;j++) {
				System.out.print(k +"\t");
				k++;
				
			}
			System.out.println("");
		}

	}

}
