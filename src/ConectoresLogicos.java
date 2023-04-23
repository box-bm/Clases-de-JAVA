import java.util.Objects;
import java.util.Scanner;

public class ConectoresLogicos {
    public static void main(String[] args) {
        // (||) OR
        Scanner scanner = new Scanner(System.in);
        String fruta = "", tienesDinero = "";

        System.out.print("Ingresa una fruta: ");
        fruta = scanner.next();

        System.out.print("Ingresa si o no si tienes dinero: ");
        tienesDinero = scanner.next();

        // fruta == "manzana" || fruta == "pera"
//         false || false || true = true;
        if (Objects.equals(fruta, "manzana") || Objects.equals(fruta, "pera") || Objects.equals(fruta, "piña")) {
            System.out.println("Entonces comprala");
        } else {
            System.out.println("Entonces no la compre");
        }


        // true && false = false
        // true && true = true
        if (Objects.equals(fruta, "manzana") && Objects.equals(tienesDinero, "si")) {
            System.out.println("Entonces comprala");
        } else {
            System.out.println("Entonces no la compre");
        }

        // (true || false || false) && true
        // (true || false || false) = true
        // (true) && true = true
        if ((Objects.equals(fruta, "manzana") || Objects.equals(fruta, "pera") || Objects.equals(fruta, "piña")) && Objects.equals(tienesDinero, "si")) {
            System.out.println("Entonces compra la fruta");
        }
    }
}
