class Pen{
    String color;
    String type; //ballpoint, gel, fountain
    public void write(){
        System.out.println("Writing something with " + color + " " + type + " pen");
    }
}
public class javaOpps {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "ballpoint";

        pen1.write(); 
    }
}    