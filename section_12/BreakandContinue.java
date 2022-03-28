package section_12;

public class BreakandContinue {
	public static void main(String[] args) {
// break same for while and do while loop as well
		for (int i = 0; i < 8; i++) 
		{
			if (i==5) 
			{
				break;
			}
			System.out.println(i);
		}
System.out.println("continue");
// continue same for for and do while loop 
		int j=1;
		while(j<8) 
		{
			if(j==5) 
			{
				j++;
			continue;
		}
		System.out.println(j);
		j++;
		}
	}
}
