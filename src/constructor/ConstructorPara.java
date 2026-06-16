package constructor;

public class ConstructorPara {

	public static void main(String[] args) {
		ConstructorPara obj = new ConstructorPara("Dev");  // 
//		Constructor -> Same name as class name
//		Constructor -> No return type
//		Constructor -> Called automatically
//		Used to created an object

	}
	
	public void display() {
		System.out.println("Display Method");
	}
	
	ConstructorPara(String name) {  // constructor block
		System.out.println("Constructor Block");
	}

}
