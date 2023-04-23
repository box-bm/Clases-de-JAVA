public class Arreglos {
    public static void main(String[] args) {
        // Arreglos permiten un tipo de dato
        // [], {}
        // Tienen un indice, empieza desde la posicion 0

        // Caracteristicas
        // Valores: [20, 30, 40, 50]
        // Indices:   0,  1,  2,  3
        // largo (lenght): 4
        // elemento: arreglo[2] == 40
        // tienen siempre un orden
        // pueden o no tener un largo* (c++ es estatico)
        // listas o arreglos dinamico, [] de n elementos

        // Son considerados como objetos
        // [].push() // Agregar elementos al final
        // [].pop() // eliminar el ultimo
        // [].map((e) => e)

        // []
        // arreglo.push("Huevos");
        // arreglo.push("Estrellados);
        // ["Huevos", "Estrellados"]

        int[] arreglo = {20, 30, 40, 50};
        System.out.println(arreglo[2]);

        arreglo[2] = 90;

        System.out.println(arreglo[2]);

        int total = 0;
        for (int elemento : arreglo) {
            total += elemento;
        }

//        Forma antigua
//        for (int i = 0; i < arreglo.length; i++) {
//            total += arreglo[i];
//        }

        System.out.println(total);
    }
}
