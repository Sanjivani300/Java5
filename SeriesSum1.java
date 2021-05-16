//Q. SERIES SUM 1
// Write a program to calculate the sum of following series where n is input by user.
// 1 + 1/2 + 1/3 + 1/4 + 1/5 +......1/n
package loops;
import java.util.Scanner;

public class SeriesSum1 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no");
        int n = obj.nextInt();                  //n=6  1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 = 2.4500003
        float result = 0;                       //ie. 6= 2.4500003
        for (float i = 1; i <= n; i++) {
            result = result + 1 / i;
        }
        System.out.println(result);
    }
}
