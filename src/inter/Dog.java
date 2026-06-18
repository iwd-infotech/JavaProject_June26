package inter;

public class Dog implements Animal{

	@Override
	public void sound() {
		System.out.println("Dog - sound");
		
	}

	@Override
	public void fourLegs() {
		System.out.println("Dog - fourLegs");
		
	}

	@Override
	public void colour() {
		System.out.println("Dog - colour");
		
	}

}
