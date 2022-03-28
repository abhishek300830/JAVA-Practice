package section_12;

public class forloop {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		// Normal for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// for each loop
		for(int num:arr) {
			System.out.println(num);
		}
		// label loop
		loop1:
		for(int j=1;j<5; j++) {
			//loop2:
			for (int k = 1; k < 5; k++) {
				if(j==3 && k==3) {
					break loop1;
				}
				else
				System.out.println(j+"  "+k);
			}
			
		}
}
}
