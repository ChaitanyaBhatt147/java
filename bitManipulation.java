
import java.util.*;
public class bitManipulation {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = 5;
    int pos = 1;
    int bitMask = 1<<pos;
    // Get bit
    int newNumber = bitMask & a;
    System.out.println(newNumber);
    // set bit
    pos=2;
    bitMask = 1<<pos;
    int notBitMask = ~(bitMask);
    System.out.println(notBitMask);
    newNumber = notBitMask & a;
    System.out.println(newNumber);
    // update bit
    int oper = sc.nextInt();
    pos=1;
    bitMask = 1<<pos;
    if (oper == 1) {
        newNumber = bitMask | a;
        System.out.println(newNumber);
    }
    else{
        notBitMask = ~(bitMask);
        newNumber = notBitMask &a;
        System.out.println(newNumber);
    }
}
    
}