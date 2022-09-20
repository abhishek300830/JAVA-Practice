package section_0.basic.ControlStatements;

public class ifelseif {
	public static void main(String[] args) {
		int marks = 90;
		if (marks < 33) {
			System.out.println("failed");
		} else if (marks > 33 && marks <= 50) {
			System.out.println("c grade");
		} else if (marks > 50 && marks <= 80) {
			System.out.println("b grade");
		} else if (marks > 80 && marks <= 100) {
			System.out.println("a grade");
		} else {
			System.out.println("invalid");
		}
	}
}
