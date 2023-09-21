/*print the pattern as follows for n = 4 without using arrays
 * 10
 * 09 04
 * 08 05 03
 * 07 06 02 01
 */

import java.util.*;

public class halfPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = sc.nextInt();
        System.out.println("The pattern is:");
        printprimid(row);
    }

    public static void printprimid(int row) {
        int number = (row * (row + 1)) / 2;
        for (int i = 0; i < row; i++) {
            int k = number - i;
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    System.out.printf("%02d ",k);
                } else if (j % 2 != 0) {
                    k = k - (((row - i)*2)-1);
                    System.out.printf("%02d ",k);
                } else if (j % 2 == 0) {
                    k = k - (((i-j)+1)*2);
                    System.out.printf("%02d ",k);
                }
            }
            System.out.println();
        }
    }

}
