package Excercise_1;

import java.util.Scanner;

/* Write a program to print Fibonacci series of n terms where n is input
by user :
0 1 1 2 3 5 8 13 21 .....
In the Fibonacci series, a number is the sum of the previous 2 numbers that
came before it. */
public class Question_10_Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(".....Fibonacci Series.....");
        System.out.print("Enter the Value of N :");
        int n = sc.nextInt();
        sc.close();
        int a = 0, b = 1;
        System.out.print(a + " ");
        if (n > 1) {
            for (int i = 1; i < n; i++) {
                System.out.print(b + " ");
                int temp = b;
                b = a + b;
                a = temp;
            }

        }

    }

}
