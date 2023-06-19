import java.util.*;
public class question1 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Enter '1' for addition '2' for diffrence '3' for multiplication '4' for division '5' for module");
    int button = sc.nextInt();
    switch (button) {
        case 1:
            System.out.println("The sum of "+a+" and "+b+" is: "+(a+b));
            break;
    
        case 2:
            System.out.println("The difference of "+a+" and "+b+" is: "+(a-b));
            break;
    
        case 3:
            System.out.println("The multiplication of "+a+" and "+b+" is: "+(a*b));
            break;
    
        case 4:
            System.out.println("The division of "+a+" and "+b+" is: "+(a/b));
            break;
    
        case 5:
            System.out.println("The modules of "+a+" and "+b+" is: "+(a%b));
            break;
    
        default:
            System.out.println("Invalid operation");
            break;
    }
}
    
}