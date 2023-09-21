import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el tamaño del cuadrado: ");
        int size = scanner.nextInt();
        
        scanner.close();

        // Dibujar el cuadrado
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    System.out.print("|"); // Dibuja un borde vertical
                } else {
                    System.out.print("x"); // Relleno con "x" en el interior
                }
            }
            System.out.println(); // Salto de línea para avanzar a la siguiente fila
        }
    }
}
