package basic.ControlStatements;

public class FindTheBiggest 
{
	public static void main(String[] args) 
	{
		int a=20,b=80,c=40;
		if(a>=b && a>=c) 
		{
			System.out.println(a+" is Bigger");
		}
		else if (b>=a && b>=c) {
			System.out.println(b+" is Bigger");
		}
		else {
			System.out.println(c+" is Bigger");
		}
	}
}
