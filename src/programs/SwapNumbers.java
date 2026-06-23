package programs;

public class SwapNumbers {

	public static void main(String[] args) {
//		a = 10;   -> Input 
//		b = 20;
		
//		a = 20;   -> Output
//		b = 10;
		
		int a = 10;
		int b = 20;
		int temp;
		
		System.out.println("Before Swapping");
		System.out.println("A = " +a);
		System.out.println("B = " +b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("After Swapping");
		System.out.println("A = " +a);
		System.out.println("B = " +b);
		

	}

}
