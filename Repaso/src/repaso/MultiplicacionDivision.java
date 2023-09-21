/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Scanner;

/**
 *
 * @author uestudiantes
 */
public class MultiplicacionDivision {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcion; 
        int i = 0;
        do{
            System.out.println("Menu de Opciones");
            System.out.println("1. Multipliacion");
            System.out.println("2. Division");
            System.out.println("3. Promedio");
            System.out.println("4. Salir");
            System.out.println("Elija una opcion");
            
            opcion = read.nextInt();
            
            switch(opcion){
                case 1: 
                    int num1, num2;
                    System.out.println("Ingrese el valor del numero 1:");
                    num1 = read.nextInt();
                    System.out.println("Ingrese el valor del numero 2: ");
                    num2 = read.nextInt();
                    int resultadoMultiplicacion = num1*num2;
                    System.out.println("El resultado es: "+resultadoMultiplicacion);
                case 2:
                    int numero1, numero2;
                    int resultadoDivision; 
                    System.out.println("Ingrese el valor ");
                    numero1 = read.nextInt();
                    System.out.println("Ingrese el valor del numero 2: ");
                    numero2 = read.nextInt();
                    resultadoDivision= numero1/numero2;
                    System.out.println("El resultado es: "+resultadoDivision);
                case 3:
                    int number1 , numer2;
                    int resultadoPromedio;
            }
            
        }while(i!=4);
        
    }
        
}