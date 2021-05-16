import java.awt.Color;
import java.util.Scanner;

public class AppDay3 {
    public static void main(String[] args) throws Exception {
    try{
        Scanner lector = new Scanner(System.in);
        System.out.println("Indique el digito de 6 numeros a convertir");
        String color = "#" + lector.nextLine();

        if (color.length() < 7 || color.length() > 7 ){
                System.out.println("El digito ingresado es erronero");

        }

        else{

            System.out.println(("Su codigo RGB es: " + Color.decode(color)));
        }
    lector.close();

    }
    catch(Exception e ){
        System.out.println(e);
    }


     }
     
    }

