import java.awt.Color;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner lector = new Scanner(System.in);
       System.out.println("Indique el codigo Hex que desea cambiar");
       String color = "#" + lector.nextLine();

       System.out.println("El resultado es:" + Color.decode(color));
    }
}
