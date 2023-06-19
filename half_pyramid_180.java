import java.util.*;

public class half_pyramid_180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        // outter loop
        for (int i = 0; i < a; i++) {
            // inner loop -> space
            for (int j = 1; j < (a - i); j++) {
                System.out.print(" ");
            }
            // inner loop -> *
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
