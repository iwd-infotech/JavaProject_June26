package collection;

import java.util.ArrayList;

public class ArrayListClass {

	public static void main(String[] args) {
//		String s1 = "Amit";
//		String s2 = "Ajay";
//		String s3 = "Vijay";
//		String s4 = "Ram";
//		String s5 = "Dev";
		
		ArrayList<String> students = new ArrayList<String>();
		students.add("Rahul");
		students.add("Ajay");
		students.add("Vijay");
		students.add("Ram");
		students.add("Rahul");
		
		System.out.println(students);
		
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
		
		
	}

}
