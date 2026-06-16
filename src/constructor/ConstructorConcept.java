package constructor;

public class ConstructorConcept {

	public static void main(String[] args) {
		ConstructorConcept obj = new ConstructorConcept();
//		Constructor -> Same name as class name
//		Constructor -> No return type
//		Constructor -> Called automatically
//		Used to created an object

	}
	
	public void display() {
		System.out.println("Display Method");
	}
	
	ConstructorConcept() {  // constructor block
		System.out.println("Constructor Block");
	}

}
