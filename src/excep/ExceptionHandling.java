package excep;

public class ExceptionHandling {
//	int a = 10;

	public static void main(String[] args) {
		
		try {
			System.out.println("Database connected");
		} 
		catch (Exception e) {
			System.out.println("Exception Handled: ");
		}
		finally {
			System.out.println("Database Closed");
		}

	}

}
