package section_15;

public class String_methods {
	public static void main(String[] args) {
		String s="Hello World Program";
		System.out.println(s.length()); // to print length of string
		
		System.out.println("Another way of printing length of array");
		int len = s.length();
		System.out.println(len); // to print length of string
		
		// to Print String in Upper case and lower case
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		// String Concatination
		String str1 = "Welcome to";
		String str2 = "India";
		
		System.out.println(str1.concat(str2));
		// or want space
		System.out.println(str1.concat(" ").concat(str2));
		// another way
		System.out.println(str1+str2);
		System.out.println(str1+" "+str2);

		
	}
}
