package oops;

public class GlobalAndLocalVaribles {
	
	int m = 50;  // Global Variable -> Scope of the global variables within class
	static int a = 10;
	String str = "Java";

	public static void main(String[] args) {
		int n = 10;  // local variable -> scope of the local variables within the method only
		System.out.println(a+n);
		
//		GlobalAndLocalVaribles -> Class name
//		obj -> reference variable
//		new -> keyword
//		GlobalAndLocalVaribles() -> Class Constructor 
//		new GlobalAndLocalVaribles();   -> Object
		GlobalAndLocalVaribles obj = new GlobalAndLocalVaribles();
		obj.demo();
		obj.display();
		
	}
	
	public void display() {
//		System.out.println(a);  // a cannot be resolved to a variable ->
		System.out.println(m);
		
	}
	
	public void demo() {
		int b = 10;
		System.out.println(m+b);
	}

}
