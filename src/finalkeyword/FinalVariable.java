package finalkeyword;

public class FinalVariable {

	public static void main(String[] args) {
//		Once assigned, the value cannot changed
		final double d1 = 33.1;
		
		System.out.println(d1);
		
//		d1 = 100; Error
		System.out.println(d1);

	}

}
