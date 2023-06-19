import java.util.*;
public class solid_rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 
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
                System.out.print("*");                
            }
            System.out.print("\n");
        }
    }
}
