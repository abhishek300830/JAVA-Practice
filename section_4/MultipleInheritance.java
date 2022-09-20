package section_4;

class a {
	void method_a() {
		System.out.println("This is Class A method");
	}
}

class b extends a {
	void method_b() {
		System.out.println("This is Class B Method");
	}
}

class c extends b {
	void method_c() {
		System.out.println("This is Class C Method");
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		c obj = new c();
		obj.method_a();
		obj.method_b();
		obj.method_c();
	}
}
