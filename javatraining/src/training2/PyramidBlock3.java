package training2;

public class PyramidBlock3 {

	public static void main(String[] args) {
		int k=3;
		
		for (int i=1;i<=3;i++) {
			
			for (int j=0;j<i;j++) {
				System.out.print(k +"\t");
				k=k+3;
			}
			System.out.println("");
		//	k=3;
		}

	}

}
