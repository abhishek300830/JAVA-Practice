package section_3;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "Welcome";
		String s2 = "Welcome"; // literal approach
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());// if data is same than address is aslo same
		System.out.println(s2.hashCode());

		String s3 = new String("Hello"); // using new keyword
		String s4 = new String("Hello");
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		char c[] = { 'C', 'h', 'a', 'r', 'a', 'c', 't', 'e', 'r' };
		String s5 = new String(c);
		System.out.println(s5);

	}
}
