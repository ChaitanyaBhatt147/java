import java.util.*;

public class functionFactorial {
    public static int factorial(int a){
        if (a < 0) {
            System.out.println("Invalid number");
            return 0;            
        }
        int fact = 1;
        for (int i = a; i > 0; i--) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();
        System.out.println("The Factorial of "+a+" is: "+ factorial(a));
    }
}