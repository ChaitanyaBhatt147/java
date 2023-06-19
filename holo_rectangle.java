import java.util.*;

public class holo_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.print("\n");
        System.out.print("Enter the number of colums: ");
        int b = sc.nextInt();
        System.out.print("\n");
        // outer loop
        for (int i = 0; i < a; i++) {
            // inner loop
            for (int j = 0; j < b; j++) {
                if (i == 0 || j == 0 || i == (a - 1) || j == (b - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
