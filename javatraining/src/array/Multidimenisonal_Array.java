package array;

public class Multidimenisonal_Array {

	public static void main(String[] args) {
		
		int a[][]=new int[3][3];
		
		a[0][0]=2;
		a[0][1]=5;
		a[0][2]=6;
		a[1][0]=12;
		a[1][1]=55;
		a[1][2]=64;
		a[2][0]=28;
		a[2][1]=57;
		a[2][2]=65;
		
		
		for(int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				System.out.print(a[i][j]+ "\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
