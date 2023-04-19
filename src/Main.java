import java.util.Scanner;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.next();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.next();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        System.out.println("Bienvenido(a) " + nombre + " " + apellido + " de " + edad + " años de edad.");

        scanner.close();

    }
}