import java.util.*;
public class functionMethod {
    public static void Name(String name){
        System.out.println("Hello, "+name+" welcome to java.");
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Name(name);
    }
}
