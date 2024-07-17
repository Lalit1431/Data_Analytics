package array;

public class Array1 {

	public static void main(String[] args) {
		// a container which store multiply value of same type
		
		int a[]=new int[5];
		a[0]=5;
		a[1]=15;
		a[2]=20;
		a[3]=25;
		a[4]=30;
		
		int b[]= {4,5,6,7};
		
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for (int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

	}

}
