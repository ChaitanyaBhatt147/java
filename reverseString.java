import java.util.*;
public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System .in);
        System.out.print("Enter the String: ");
        String stri = sc.nextLine();
        StringBuilder str = new StringBuilder(stri);

        for (int i = 0; i < str.length()/2; i++) {
            int front=i;
            int back=str.length()-1-i;
            char frontchar = str.charAt(front);
            char backchar = str.charAt(back);
            str.setCharAt(front, backchar);
            str.setCharAt(back, frontchar);
        }
        System.out.print("The reverse string is: "+str);
    }
}