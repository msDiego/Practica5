
package TestPackage;

import Practica5.Calculadora;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 34601
 */
public class TestFile {
    
    public TestFile() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    

    /**
     * Test of main method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Calculadora.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testSumar() {
        System.out.println("sumar");
        double x = 2;
        double y = 3;
        Calculadora instance = new Calculadora();
        double expResult = 5;
        double result = instance.sumar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testRestar() {
        System.out.println("restar");
        double x = 3;
        double y = 2;
        Calculadora instance = new Calculadora();
        double expResult = 1;
        double result = instance.restar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double x = 2;
        double y = 3;
        Calculadora instance = new Calculadora();
        double expResult = 6;
        double result = instance.multiplicar(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @org.junit.jupiter.api.Test
    public void testDividir() {
        System.out.println("dividir");
        double x = 4;
        double y = 2;
        Calculadora instance = new Calculadora();
        double expResult = 2;
        double result = instance.dividir(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}