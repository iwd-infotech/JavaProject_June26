package inter;

public class Mobile implements Camera, Music{

	@Override
	public void click() {
		System.out.println("Camera");
		
	}

	@Override
	public void play() {
		System.out.println("Music");
		
	}

}
