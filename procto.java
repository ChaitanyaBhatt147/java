import java.util.*;
import java.math.*;

public class procto{
    public static boolean isPrime(int num){
        if (num == 0 || num == 1)return false;
        for (int i = 2; i < num/2; i++) {
            if (num%i == 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (isPrime(num)){
            double root = Math.sqrt(num);
            BigDecimal dnumber = BigDecimal.valueOf(root);
            BigDecimal Sroot = dnumber.setScale(2, RoundingMode.HALF_UP);
            double Rroot = Sroot.doubleValue();
            System.out.println(Rroot);

        }
        else{
            System.out.println(num + " is not prime");
        }
        
    }
}