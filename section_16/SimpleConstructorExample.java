package section_16;

public class SimpleConstructorExample {
	String name;
	public SimpleConstructorExample() {
		this.name = "Hello guys this is a String";
	}
	public static void main(String[] args) {
		SimpleConstructorExample obj = new SimpleConstructorExample();
		System.out.println(obj.name);
	}
}
