package keywords;

public class Child extends Parent{
	
	int x = 20;
	
	void display() {
		System.out.println(x);
		System.out.println(super.x);
	}
}
