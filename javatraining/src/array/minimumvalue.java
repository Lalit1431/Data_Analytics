package array;

public class minimumvalue {

	public static void main(String[] args) {
		int abc[][]= {{52,4,5},{5,48,78},{41,4,47}};
		
		int min=abc[0][0];
		for (int i =0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				if(abc[i][j]<min) {
					min=abc[i][j];
				}
				
				
			}
		}
		System.out.println(min);
		
	}

}
