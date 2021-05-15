import java.awt.Color;
import java.util.Scanner;

public class AppDay2 {
    public static void main(String[] args) throws Exception {
     Scanner lector = new Scanner(System.in);
     System.out.println("Indique el codigo a transformar");
     String color = "#" + lector.nextLine();

     if(color.length() < 7 || color.length() > 7){
            System.out.println("El codigo indicado esta erroneo");
     }
     else {
        System.out.println("Su codigo RGB es " + Color.decode(color));
        lector.close();
     }
     
    }
}
