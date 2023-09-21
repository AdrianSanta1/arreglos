import java.util.Scanner;

 

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 

        while (true) {
            System.out.println("Calculadora Java");
            System.out.println("1. División");
            System.out.println("2. Multiplicación");
            System.out.println("3. Tabla de multiplicar");
            System.out.println("4. N Primos");
            System.out.println("5. Salir del programa");
            System.out.print("Seleccione una opción: ");

 

            int opcion = scanner.nextInt();

 

            if (opcion == 2) {
                System.out.print("Ingrese el primer número: ");
                double num1 = scanner.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                double num2 = scanner.nextDouble();
                double resultado = num1 * num2;
                System.out.println("Este es el resultado de la multiplicación es: " + resultado);

 

            } else if (opcion == 1) {
                System.out.print("Ingrese el numerador: ");
                double numerador = scanner.nextDouble();
                System.out.print("Ingrese el denominador: ");
                double denominador = scanner.nextDouble();

 

                if (denominador != 0) {
                    double resultado = numerador / denominador;
                    System.out.println("Este es el resultado de la división es: " + resultado);
                } else {
                    System.out.println("No se puede dividir por cero.");
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el número de la tabla de multiplicar: ");
                int numeroTabla = scanner.nextInt();

                System.out.println("Tabla de multiplicar del " + numeroTabla + ":");

                for (int i = 1; i <= 10; i++) {
                    int resultado = numeroTabla * i;
                    System.out.println(numeroTabla + " x " + i + " = " + resultado);
                }
            } else if (opcion == 4) {
                System.out.print("Ingrese un número entero: ");
                int numeroTabla = scanner.nextInt();
                
                for (int i = 1; i <= 10; i++) {
                    int numeroInicial = scanner.nextInt();
                    int contadorImpares = 0;
                    int sumaImpares = 0;
                    
                    while (contadorImpares < 90) {
                        if (numeroInicial % 2 != 0) { // Verificamos si el número es impar
                            sumaImpares += numeroInicial;
                            contadorImpares++;
                        }
                        numeroInicial++;
                    }

        System.out.println("La suma de los primeros 90 números impares a partir de " + (numeroInicial - 90) + " es: " + sumaImpares);
                }
            } else if (opcion == 5) {
                System.out.println("Saliendo del programa...");
                break;
            } else {
                System.out.println("Opción no válida. Por favor, seleccione 1, 2, 3 o 4.");
            }
        }

 

        scanner.close();
    }
}