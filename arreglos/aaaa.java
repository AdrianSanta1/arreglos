import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de notas: ");
        int n = scanner.nextInt();

        double[] notas = new double[n];
        double suma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese su Nota" + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / n;

        System.out.println("Notas ingresadas:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nota #" + (i + 1) + ": " + notas[i]);
        }

        System.out.println("Promedio de notas: " + promedio);

        scanner.close();
    }
}
