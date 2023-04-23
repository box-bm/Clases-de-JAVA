import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Listas {
    public static void main(String[] args) {
        // listas dinamicas
        // mismas propiedades de un arreglo
        // agregan opciones para modificar la lista
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String busqueda = "";
        List<String> lista = new ArrayList<>();
        List<String> verduras = new ArrayList<>();

        verduras.add("Lechuga");
        verduras.add("Tomates");

        lista.add("Manzana"); //0
        lista.add("Pera");// 1
        lista.add("Piña");// 2
        lista.add("Uva");
        lista.add("Durazno");
        lista.add("Limon"); // 5

        System.out.println(lista.toString());

        System.out.println("Menu de frutas");
        System.out.println("---------------------");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println((i + 1) + ". " + lista.get(i));
        }
        System.out.println((lista.size() + 1) + ". Quitar ultimo");
        System.out.print("Ingresa una opcion: ");
        opcion = scanner.nextInt();

        if ((lista.size() + 1) == opcion) {
            lista.remove(lista.size() - 1);
        }

        System.out.print("Ingresa una fruta para buscar: ");
        busqueda = scanner.next();

        if (lista.contains(busqueda)) {
            System.out.println("Encontró la fruta: " + busqueda);
        } else {
            System.out.println("No se ha encontrado.");
        }

        System.out.println(lista.toString());

        lista.addAll(verduras);
        System.out.println(lista);

        List<String> frutasFavoritas = lista.subList(0, 4);

        System.out.println(frutasFavoritas.toString());

        lista.clear();

    }
}
