import java.util.Scanner;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tabla, limite;
        System.out.print("Que tabla desea ingresar: ");
        tabla = scanner.nextInt();

        System.out.print("Hasta que limite?  ");
        limite = scanner.nextInt();

        for (int i = 1; i <= limite; i++) {
            System.out.println(tabla + "*" + i + " = " + tabla * i);
        }
    }
}
