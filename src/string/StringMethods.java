package string;

public class StringMethods {

	public static void main(String[] args) {
		String str = "Automation";
		System.out.println(str.length());
		
		String str1 = "Java";
		System.out.println(str1.charAt(2));
		System.out.println(str1.charAt(2));
		
		String str2 = "Java";
		String str3 = "java";
		
		System.out.println(str2.equals(str3));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		String str4 = "Automation Testing";
		System.out.println(str4.contains("Testing"));
		
		System.out.println(str3.toUpperCase());
		
		System.out.println(str2.replace("Java", "Selenium"));
		
		String str5 = "   Amit   ";
		System.out.println(str5.length());
		String str6 = str5.trim();
		System.out.println(str6.length());
		
	}

}
