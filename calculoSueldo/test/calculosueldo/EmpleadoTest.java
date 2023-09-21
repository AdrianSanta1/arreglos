/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package calculosueldo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uestudiantes
 */
public class EmpleadoTest {
    
    public EmpleadoTest() {
    }

    @Test
    public void testCalcularSueldo() {
        System.out.println("calcularSueldo");
        Empleado instance = new Empleado();
        double expResult = 0.0;
        double result = instance.calcularSueldo();
        assertEquals(expResult, result, 0.0);
    }
    
}
