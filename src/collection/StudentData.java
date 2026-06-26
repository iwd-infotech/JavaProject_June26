package collection;

import java.util.HashMap;

public class StudentData {

	public static void main(String[] args) {
//		 101: Rahul
//		 102: Amit
//		 103: Ajay
		
		HashMap<Integer, String> students = new HashMap<Integer, String>();
		students.put(101, "Rahul");
		students.put(102, "Amit");
		students.put(103, "Ajay");
		
		System.out.println(students);
		System.out.println(students.get(102));

	}

}
