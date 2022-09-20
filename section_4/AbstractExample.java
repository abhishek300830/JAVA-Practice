package section_4;

abstract class machine {
	abstract void add();
}

public class AbstractExample {
	void add() {
		System.out.println("This is add Funtion");
	}

	public static void main(String[] args) {
		AbstractExample obj = new AbstractExample();
		obj.add();
	}
}
