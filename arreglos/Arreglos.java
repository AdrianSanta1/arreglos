/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

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
