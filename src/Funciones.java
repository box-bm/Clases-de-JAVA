import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
//        String saludo = "Bienvenido, mi nombre es: Brandon";
        // Saludar va a devolver un String;
        // METODO
        saludar();

        // FUNCIONES
        int suma1 = suma(8, 10);
        int suma2 = suma(12, 15);

        System.out.println(suma1);
        System.out.println(suma2);

        // Mi calculadora
//        calculadora().calc();

        calculadora().suma();

        new ControladorSQL().guardarUsuario("Brandon");
        // < continua aqui
    }

    public static void saludar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingres el nombre: ");
        String nombre = scanner.next();
        System.out.println("Bienvenido, mi nombre es: " + nombre);


    }

    public static Calculadora calculadora() {
        return new Calculadora();
    }

    public static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public static Scanner input() {
        Scanner input = new Scanner(System.in);
        return input;
    }
}
