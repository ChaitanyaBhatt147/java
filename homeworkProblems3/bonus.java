import java.util.*;

public class bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= (num/2); i++) {
            if ((num % 1) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            if (num==1) {
                System.out.println(num+" is nither a prime number not composit");
            } else {
                System.out.println(num+" is a prime number");

            }
        } else {
            System.out.println(num+" is not a prime number");
        }
    }
}