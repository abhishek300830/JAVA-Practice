package section_16;

public class EncapsulationExample1 {
	public static void main(String[] args) {
		other obj = new other();
		obj.add();
		// obj.subtract(); // not visible
		
		
	}
}
class other{
	void add() {
		System.out.println("This is a add funtion");
	}
	private void subtract() {
		System.out.println("This is a Sub Funtion");
	}
}