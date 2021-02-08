import java.util.Scanner;

public class Programa {
    
    public static void main(String[]args) {
        String nombre = "";
        Scanner respuesta = new Scanner(System.in);

        System.out.print("Hola, introduce tu nombre: ");
        nombre = respuesta.nextLine();

        System.out.print("\nEl nombre introducido es: " + nombre);
    }
}