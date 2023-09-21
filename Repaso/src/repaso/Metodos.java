/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

/*
 *
 * Calculadora
 *
 */
public class Metodos {

    
    public  static float resultSuma; 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int suma(3.4f , 5.555f);*/
        double resultado = resta(1233.78, 898-79);
        System.out.println("El resultado de la resta es:" +resultado);
        System.out.println(resta(3, 1));
        
        /*
        Tipos de metodos:
            1. Los tipos void(procedimiento): no retorna valores, solo ejecuta el bloque de codigo
            2. Los tipo de return; retorna el valor especificado
 
        */
 
    }
    //Tipos de metodos
    public static void suma(float num1, float num2){
        resultSuma = num1 + num2;
        System.out.println("El resultado de la suma es: "+resultSuma);
    }
    public static float getResultSuma(){
        return resultSuma; 
    }
    public static double resta(double num1, double num2){
        return num1-num2;
        
    }
    
}
