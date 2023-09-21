
package calculosueldo;

/**
 *Se desea un programa que permita calcular el sueldo a pagar a un empleado 
 * Se desea registrar nombres, apellidos, documento, suedlo base
 * Y el sueldo total a pagar. Si el empleado es mayor a 60 años se le da un 10% mas 
 * sobre el sueldo base
 */
public class CalculoSueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//-------------------------Crear instancia de empleado--------------------------
        Empleado miEmpleado = new Empleado(/*casado con el constrcutor*/);
        double sueldo = miEmpleado.calcularSueldo();
        System.out.println("Sueldo: "+sueldo);
        Empleado empleado = new Empleado("Sergio","Ardila","12020202",1000000,17);
        System.out.println(empleado.calcularSueldo());
        Empleado empleadito = new Empleado(15000, 76);
        System.out.println(""+empleadito.calcularSueldo());
        
    }
    
}
