import java.util.*;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, marks;
        do {
            
            marks = sc.nextInt();
            if (marks >= 0 && marks <= 100) {
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks < 90) {
                    System.out.println("This is also good");
                } else {
                    System.out.println("This is good as well");
                }
            } else {
                System.out.println("In valid marks");
            }
            a = sc.nextInt();
        } while (a == 1);
    }
}
