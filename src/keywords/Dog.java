package keywords;

public class Dog extends Animal{
	
//	Super.name -> Parent class variable
//	this.name -> Current class variable
	
	String name = "Dog";
	
	void display() {
		System.out.println(super.name);
		System.out.println(this.name);
	}

}
