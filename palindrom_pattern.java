import java.util.*;
public class palindrom_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the hight: ");
        int a = sc.nextInt();
        for (int i = a; i >=0; i--) {
            for (int j = 0; j < (2*i); j++) {
                System.out.print(" ");
            }
            for (int j = (a-i); j > 0; j--) {
                System.out.print(j+" ");
            }
            for (int j = 2; j <= (a-i); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
