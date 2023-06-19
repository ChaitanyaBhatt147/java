import java.util.*;

public class recursion1 {
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumber(n - 1);
    }

    public static void numberPrint(int n, int a) {
        if (a > n) {
            return;
        }
        System.out.println(a);
        numberPrint(n, a + 1);
    }

    public static void addN(int i, int n, int sum) {
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum += i;
        addN(i + 1, n, sum);
    }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = factorial(n - 1);
        int fact_n = n * fact_nm1;
        return fact_n;
    }

    public static void fibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        fibonacci(b, c, n - 1);
    }

    public static int power(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        int power_nm1 = power(x, n - 1);
        int power_n = x * power_nm1;
        return power_n;
    }

    public static int powerlog(int x, int n) {
        if (x == 0) {
            return 0;
        }
        if (n == 0) {
            return 1;
        }
        if (n % 2 == 0) {
            return powerlog(x, n / 2) * powerlog(x, n / 2);
        } else {
            return powerlog(x, n / 2) * powerlog(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int a = 1, b = 0;
        System.out.println("\n");
        printNumber(n);
        System.out.println("\n");
        numberPrint(n, a);
        System.out.println("\n");
        addN(1, n, 0);
        System.out.println("\n");
        System.out.println(factorial(n));
        System.out.println("\n");
        System.out.print(b + " ");
        System.out.print(a + " ");
        fibonacci(b, a, n - 2);
        System.out.println("\n");
        System.out.println(power(x, n));
        System.out.println("\n");
        System.out.println(powerlog(x, n));
    }
}