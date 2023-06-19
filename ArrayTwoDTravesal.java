import java.util.*;
public class ArrayTwoDTravesal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int numbers[][]=new int [3][5];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                numbers[i][j]=sc.nextInt();
            }
        }
        int x = sc.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (numbers[i][j]==x) {
                    System.out.println(x+" found at location ("+i+", "+j+")");
                }
            }
        }
    }
}
