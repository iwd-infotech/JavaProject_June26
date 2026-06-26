package wrappers;

public class WrapperClass {

	public static void main(String[] args) {
//		Primitive       Wrapper Class
//		int       		Integer
//		double          Double
//		char			Character 
//		boolean			Boolean
//		long 			Long
//		float			Float
		
		String age = "25";
		
		int value = Integer.parseInt(age);
		
		System.out.println(value + 10);
		
		String salary = "45000.00";
		System.out.println(salary);
		double sal = Double.parseDouble(salary);
		System.out.println(sal);

	}

}
