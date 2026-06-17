package poly;

public class MethodOverloading {
	int a;

//	MethodOverloading -> Same method name with different input parameters within the same class 
//	is known as method overloading
	public static void main(String[] args) {


	}
	
//	We can overload main method but this is not a good practice
//	public static void main() {
//
//
//	}

	public void display() {  // zero input parameter 

	}

//	Duplicate methods are not allowed in java
	public void display(int b) { // one input parameter 

	}
	
	public void display(int m, int n) { // Two input parameter 

	}
	
	public void display(double d) { // one input parameter 

	}

}
