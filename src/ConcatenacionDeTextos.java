import java.util.Scanner;

public class ConcatenacionDeTextos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion, seleccion = "";

        System.out.print("Ingresa el tipo de huevos: ");
        opcion = scanner.next();
        seleccion = seleccion + "Tipo de coccion: " + opcion;

        System.out.print("Ingresa la salsa: ");
        opcion = scanner.next();
        seleccion = seleccion + ", Salsa: " + opcion;

        System.out.println(seleccion);
    }
}
