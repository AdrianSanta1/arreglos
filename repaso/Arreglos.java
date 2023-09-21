/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/**
 *
 * @author uestudiantes
 */
public class Arreglos {

    public static void main(String[] args) {
       int tamano = 4;

       int[][] matriz = new int[tamano][tamano];

       int numeroImpar = 1;
       for (int i = 0; i < tamano; i++) {
           for (int j = 0; j < tamano; j++) {
               matriz[i][j] = numeroImpar;
               numeroImpar += 2; 
           }
       }

       for (int i = 0; i < tamano; i++) {
           for (int j = 0; j < tamano; j++) {
               System.out.print(matriz[i][j] + "\t");
           }
           System.out.println(); 
       }
   }
}
