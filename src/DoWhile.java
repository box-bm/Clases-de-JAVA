import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // Ciclo while, pero
        // De primero se ejecuta y luego valida si aplica al while
//        int i = 0;
//        while (i <= 10) {
//            i++;
////            System.out.println(i);
//        }

//        i = 0;

        // Entra al menos una vez
//        do {
//            i++;
//            System.out.println(i);
//        } while (i <= 10);


        ///
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        // Este hace la condicion antes del ciclo,
        // puede ejecutarce 0 o mas veces
        System.out.println("Este es el while al principio");
        while (opcion != 0) { // Al inicio
            System.out.println("---------------------------");
            System.out.print("Ingrese un numero cualquiera. (0 para salir): ");
            opcion = scanner.nextInt();
        }

        // Siempre se ejecuta 1 o mas veces
        System.out.println("Este es el while al final");
        do {
            System.out.println("---------------------------");
            System.out.print("Ingrese un numero cualquiera. (0 para salir): ");
            opcion = scanner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3); // true / false

    }
}
