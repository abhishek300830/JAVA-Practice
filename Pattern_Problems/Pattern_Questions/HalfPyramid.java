package Pattern_Problems.Pattern_Questions;
/*

*
**
***
****
*****
******
*******
********
*********
**********

*/

public class HalfPyramid {
    public static void main(String[] args) {
        int n=10;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
