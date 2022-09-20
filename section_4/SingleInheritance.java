package section_4;

class parentclass {
	int x = 10;

	void parentMethod() {
		System.out.println("This is a Parent Class Method");
	}
}

public class SingleInheritance extends parentclass {
	void ChildMethod() {
		System.out.println("This is a Child Class Method");
	}

	public static void main(String[] args) {
		SingleInheritance obj = new SingleInheritance();
		obj.parentMethod();
		obj.ChildMethod();
	}

}
