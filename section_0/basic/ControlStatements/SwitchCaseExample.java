package section_0.basic.ControlStatements;

import java.util.Scanner;

public class SwitchCaseExample {
	public static void main(String[] args) {
		double a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Value of A: ");
		a = sc.nextDouble();
		System.out.print("Enter the Value of B: ");
		b = sc.nextDouble();
		System.out.print("Enter the Operator (+ - * /): ");
		char operator = sc.next().charAt(0);
		sc.close();
		System.out.print("Operator is : " + operator);
		switch (operator) {
			case '+':
				System.out.println("Add : " + (a + b));
				break;
			case '-':
				System.out.println("Sub : " + (a - b));
				break;
			case '*':
				System.out.println("Multiply : " + (a * b));
				break;
			case '/':
				System.out.println("Divide : " + (a / b));
				break;
			default:
				System.out.println("Wrong Inputs");
		}

	}

}
