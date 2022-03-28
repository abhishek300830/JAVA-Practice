package basic.ControlStatements;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d=scan.nextDouble();
        
        Scanner scanString=new Scanner(System.in);
        String s=scanString.nextLine();
        
        scan.close();
        
        scanString.close();
        

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
    }
}
