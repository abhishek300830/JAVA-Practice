package section_4;

class Animal {
	void makeNoise() {
		System.out.println("Default Animal sound");
	}
}

class extra extends Animal {
	void makeNoise() {
		System.out.println("Extra Sound");
	}
}

public class MethodOverRidding {
	public static void main(String[] args) {
		extra obj = new extra();
		Animal obj1 = new Animal();
		obj.makeNoise();
		obj1.makeNoise();

	}

}
