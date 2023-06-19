import java.util.*;
public class number_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hight: ");
        int a = sc.nextInt();
        for (int i = a; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= (a-i); j2++) {
                System.out.print(a-i+" ");
            }
            System.out.println();
        }
    }
}
