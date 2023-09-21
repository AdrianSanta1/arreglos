/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/
package repaso;

 

/**
*
* @author uestudiantes
*/
public class Repaso {

 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //1. si sino
        int num1=34;
        int num2=134;

        if (num1 > num2){
            //Si la condicion es verdadera
           System.out.println("Numero 1 es mayor que numero 2 ");
        }else if(num2 > num1){
            //si la condicion principal es falsa y la 2da condicion verdadera
            System.out.println("Numero 2 es mayor que numero 1");
        }
        //2. Switch
        short opcion = 2;
        switch (opcion){
            case 1:
                System.out.println("selecciono la opcion 1");
                break;
            case 2:
                System.out.println("Selecciono la opcion 2");
                break;
            default:
                System.out.println("Selecciono opcion incorrecta");
        }
        //3. Ternario
        String respuesta = (opcion % 2 == 0) ? "Opcion es par " : "Opcion es impar";
        System.out.println(respuesta);
        //4. Ciclo while
        int i = 0;
        while (i<5){
            opcion +=i; //opcion = opcion+i
            System.out.println(opcion);
            i++;
         //5. ciclo do -while
         do{
            System.out.println(i);
            i--;
         }while(i<0);
        }
        //6. ciclo for->clasico
        for(int j=0;j<5; j++){
            System.out.println(j);
        }
    }

}
