package section_4;

public class MethodOverLoading {
	void add(int x) {
		System.out.println("This is one parameter function");
		System.out.println("Value of para is : " + x);
	}

	void add(int a, int b) {
		System.out.println("Sum of both A and B is : " + (a + b));
	}

	public static void main(String[] args) {
		MethodOverLoading obj = new MethodOverLoading();
		obj.add(30);
		obj.add(50, 90);
	}
}
