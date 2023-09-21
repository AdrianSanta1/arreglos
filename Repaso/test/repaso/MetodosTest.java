/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package repaso;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author uestudiantes
 */
public class MetodosTest {
    
    public MetodosTest() {
    }

    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Metodos.main(args);
    }

    @Test
    public void testSuma() {
        System.out.println("suma");
        float num1 = 10.0F;
        float num2 = 25.0F;
        float result = 25.0f;
        Metodos.suma(num1, num2);
        
    }

    @Test
    public void testGetResultSuma() {
        System.out.println("getResultSuma");
        float expResult = 0.0F;
        float result = Metodos.getResultSuma();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testResta() {
        System.out.println("resta");
        double num1 = 19.0;
        double num2 = 5.0;
        double expResult = 14.0;
        double result = Metodos.resta(num1, num2);
        assertEquals(expResult, result, 0.0);
    }
    
}
