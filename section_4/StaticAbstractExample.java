package section_4;

abstract class Machine1 {
	abstract void abstractFuntion();

	void NormalFuntion() {
		System.out.println("This is a normal funtion");
	}

	static void staticFuntion() {
		System.out.println("this is a static funtion");
	}

	final void FinalFuntion() {
		System.out.println("This is a Final funtion");
	}
}

public class StaticAbstractExample extends Machine1 {

	void abstractFuntion() {
		System.out.println("This is a abstract funtion");
	}

	public static void main(String[] args) {
		StaticAbstractExample obj = new StaticAbstractExample();
		obj.abstractFuntion();
		obj.NormalFuntion();
		// obj.staticFuntion(); or
		Machine1.staticFuntion();
		obj.FinalFuntion();

	}
}
