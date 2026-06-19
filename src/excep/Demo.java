package excep;

public class Demo {

	public static void main(String[] args) {
		
		try {
			int a = 0;
			int b = 10;
			
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("Exception Handled: " +e);
		}
		
		System.out.println("Program End...");

	}

}
