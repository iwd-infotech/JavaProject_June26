package inter;

public interface Animal {
	
//	100% abstraction
	void sound();
	void fourLegs();
	void colour();
	
	default void display() {
		System.out.println("Interface - default");
	}

}
