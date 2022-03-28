package basic.Arrays_and_Loops;

public class Arrays {
	public static void main(String[] args) {
		//  first way to initialize array
		String[] array = {"cars","bikes","trucks","cranes"};
		// second way to initialize array
		String[] arr = new String[4];
		arr[0]="hello";
		arr[1]="kaise";
		arr[2]="ho";
		arr[3]="bhai";
		
		System.out.println("Printing array");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.println(arr[i]);
			}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println(array.length);
		

}}
