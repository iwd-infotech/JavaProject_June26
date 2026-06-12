package test;

public class ArrayConcept {

	public static void main(String[] args) {
//		int a = 10;
//		a[] - array of variable
//		index will be starting from zero
		int a[] = new int[5];
		a[0] = 5;
		a[1] = 10;
		a[2] = 20;
		a[3] = 30;
		a[4] = 40;
//		a[5] = 50;  
		
		System.out.println(a[2]);
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		double d[] = new double[5];
		
		String str[] = new String[5];
		
	}

}
