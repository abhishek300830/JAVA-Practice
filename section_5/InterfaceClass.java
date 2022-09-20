package section_5;

public class InterfaceClass implements InterfaceExample {
	public void add() {
		System.out.println("This is add funtion");
	}

	public static void main(String[] args) {
		InterfaceClass obj = new InterfaceClass();
		obj.add();
		InterfaceExample ie = new InterfaceClass();
		ie.add();
		System.out.println(ie.x);
		System.out.println(obj.x);
	}

}
