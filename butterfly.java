import java.util.*;

public class butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= ((2*a) - (2*i)); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
        for (int i = a; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= ((2*a) - (2*i)); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
            System.out.println();
        }
    }
}