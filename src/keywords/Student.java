package keywords;

public class Student {

	String name;
	
	Student (String name){
//		Left Side -> Global (instance) variable
//		Right Side -> Local (parameter) variable
		this.name = name;
	}
	
	void display() {
		System.out.println(name);
	}

}
