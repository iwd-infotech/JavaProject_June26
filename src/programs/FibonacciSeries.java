package programs;

public class FibonacciSeries {

	public static void main(String[] args) {
//		0 , 1 , 1, 2, 3, 5, 8, 13, 21......
		
		int first = 0;
		int second = 1;
		
		for (int i = 1; i <= 8; i++) {
			int next = first + second;
			first = second;
			second = next;
			System.out.println(next + " ");
			
		}

	}

}
