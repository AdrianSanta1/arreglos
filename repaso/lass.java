//Jose David Nontoa Gavidia y Jesus Adrian Banguero- Primer semestre.

/*crear un arreglo de tamaño n y que se llene dinamicamente, realizar la suma de todos los numeros.
imprimir el arreglo y la suma.*/

import java.util.Random;
import java.util.Scanner;

public class ArregloSuma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño a calcular");
        int n = scanner.nextInt();
        
        System.out.println("Arreglo generado aleatoriamente: ");
        
        for (int i = 0; i < n; i++) {
            arreglo[i] = random.nextInt(300);
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
        
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += arreglo[i];
        }
        
        System.out.println("La suma de los elementos es: " + suma);

    }
}