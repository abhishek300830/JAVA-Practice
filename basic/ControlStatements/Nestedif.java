package basic.ControlStatements;

public class Nestedif {
	public static void main(String[] args) {
		int num=30;
		if(num<100) {
			System.out.println("Num is less than 100");
			if(num>25) {
				System.out.println("num is Greater than 25");
			}
		}
	}
}
