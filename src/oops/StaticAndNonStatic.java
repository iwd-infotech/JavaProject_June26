package oops;

public class StaticAndNonStatic {
	
	static int a = 10;    // Global variable & non-static

	public static void main(String[] args) {
		demo();   // direct calling
		StaticAndNonStatic object = new StaticAndNonStatic();
		object.display();
		object.test();
		StaticAndNonStatic.testing();  // By using class name
		int b = 20;
		System.out.println(a+b);

	}
	
	public void display() {
		System.out.println("Display Non-static");
	}
	
	public static void demo() {
		System.out.println("Demo Static");
	}
	
	public void test() {
		System.out.println("Test Non-static");
	}
	
	public static void testing() {
		System.out.println("Testing Static");
	}

}
