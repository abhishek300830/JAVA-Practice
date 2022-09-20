package section_4;

class bird {
	void Bird_method() {
		System.out.println("This is a bird method ");
	}
}

class eagle extends bird {
	void eagle_method() {
		System.out.println("this is a eagle method");
	}
}

class pegion extends bird {
	void pegion_method() {
		System.out.println("This is Pegion method");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		eagle obj = new eagle();
		obj.eagle_method();
		obj.Bird_method();
		pegion obj1 = new pegion();
		obj1.pegion_method();
		obj1.Bird_method();

	}
}
