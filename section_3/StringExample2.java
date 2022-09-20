package section_3;

public class StringExample2 {
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.isEmpty());
		String s2 = "Hello";
		String s3 = s2.replace("Hello", "Replaced text");
		System.out.println(s3);
		String s4 = s3.replaceFirst("R", "P");
		System.out.println(s4);
		String s5 = s4.replaceAll("t", "X");
		System.out.println(s5);
	}
}
