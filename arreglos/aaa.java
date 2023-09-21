import java.util.Random;

public class Matriz4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(9) + 4; 

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int numero;
                do {
                    numero = rand.nextInt(9) + 4; 
                } while (numero % 2 == 0); 
                matriz[i][j] = numero;
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
