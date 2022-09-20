package section_4;

public class ParameterizedConstructor {
	long mobileNumber;
	String YourName;

	ParameterizedConstructor(long mobile, String name) {
		this.YourName = name;
		this.mobileNumber = mobile;
		System.out.println("Name is : " + YourName);
		System.out.println("Number is : " + mobileNumber);
	}

	public static void main(String[] args) {
		ParameterizedConstructor obj = new ParameterizedConstructor(9759250020l, "Abhi");

	}
}
