package accessModifier;

public class Students {
//	Accessible from anywhere
	public String name = "Rahul";
	
//	Accessible only within the class
	private String password = "admin321";
	
//	Accessible within the same package & by subclasses
	protected int marks = 98;
	
//	Default -> Accessible only within same package
	String city = "Pune";

}
