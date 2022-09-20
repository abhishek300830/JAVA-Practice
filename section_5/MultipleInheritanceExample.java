package section_5;

public class MultipleInheritanceExample implements Interface1, Interface2 {
	public void method1() {
		System.out.println("this is method 1");
	}

	public void method2() {
		System.out.println("This is method 2");
	}

	public static void main(String[] args) {
		MultipleInheritanceExample obj = new MultipleInheritanceExample();
		obj.method1();
		obj.method2();
		Interface1 obj1 = new MultipleInheritanceExample();
		Interface2 obj2 = new MultipleInheritanceExample();
		obj1.method1();
		obj2.method2();
	}
}
