import java.util.Scanner;

public class Calculadora {
    public void calc() {
        Scanner scanner = new Scanner(System.in);

        double resultado;
        int opcion;

        System.out.println("Calculadora");
        System.out.println("-----------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia");
        System.out.println("6. Raíz cuadrada");
        System.out.println("8. Salir");

        do {
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    suma();
                    break;

                case 2:
//                    System.out.print("Ingrese el primer número: ");
//                    num1 = scanner.nextDouble();
//
//                    System.out.print("Ingrese el segundo número: ");
//                    num2 = scanner.nextDouble();
//
//                    resultado = num1 - num2;
//                    System.out.println("El resultado de la resta es: " + resultado);
//                    break;

                case 3:
//                    System.out.print("Ingrese el primer número: ");
//                    num1 = scanner.nextDouble();
//
//                    System.out.print("Ingrese el segundo número: ");
//                    num2 = scanner.nextDouble();
//
//                    resultado = num1 * num2;
//                    System.out.println("El resultado de la multiplicación es: " + resultado);
//                    break;

                case 4:
//                    System.out.print("Ingrese el primer número: ");
//                    num1 = scanner.nextDouble();
//
//                    System.out.print("Ingrese el segundo número: ");
//                    num2 = scanner.nextDouble();
//
//                    if (num2 != 0) {
//                        resultado = num1 / num2;
//                        System.out.println("El resultado de la división es: " + resultado);
//                    } else {
//                        System.out.println("No se puede dividir por cero");
//                    }
                    break;

                case 5:
//                    System.out.print("Ingrese el número: ");
//                    num1 = scanner.nextDouble();
//
//                    System.out.print("Ingrese el exponente al que quiere elevar el número: ");
//                    double exponente = scanner.nextDouble();
//
//                    resultado = Math.pow(num1, exponente);
//
//                    System.out.println("El resultado de elevar " + num1 + " a la potencia de " + exponente + " es: " + resultado);
                    break;

                case 6:
//                    System.out.print("Ingrese el número para calcular su raíz cuadrada: ");
//                    num1 = scanner.nextDouble();
//
//                    resultado = Math.sqrt(num1);
//
//                    System.out.println("La raíz cuadrada de " + num1 + " es: " + resultado);
                    break;

                case 8:
                    System.out.println("Adiós!");
                    break;
            }

        } while (opcion == 8);
    }

    public void suma() {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, resultado;

        System.out.print("Ingrese el primer número: ");
        num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        num2 = scanner.nextDouble();

        resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
}