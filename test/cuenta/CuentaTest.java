/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package cuenta;

import Excepciones.DatosIncorrectos;
import Excepciones.LimiteSaldo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author juank
 */
public class CuentaTest {
    
    private Cuenta cuenta1, cuenta2;
    
    
    public CuentaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Este es el test de la Cuenta1
     */
    @Test
    public void testCuenta1() {
        try {
            System.out.println("Este es el test de la Cuenta 1.");
            this.cuenta1 = new  Cuenta(50, 12345);
            float result= -1;
            
            
            System.out.println("1. Withdraw $200 from account #12345");
            cuenta1.retiro(200);
            System.out.println("3. Deposit $100 into account #12345");
            cuenta1.ingreso(100);
            System.out.println("6.- Withdraw $200 from account #12345");
            result = cuenta1.retiro(200);
            assertEquals(-250, result);
            System.out.println("El balance final de la cuenta 1 es:" + result);
        } catch (DatosIncorrectos ex) {
                System.out.println(ex.getMessage());

//Logger.getLogger(CuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LimiteSaldo ex) {
                System.out.println(ex.getMessage());

// Logger.getLogger(CuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
 /**
     * Este es el test de la Cuenta1
     */
    @Test
    public void testCuenta2() {
        try {
            System.out.println("Este es el test de la Cuenta 2.");
            this.cuenta1 = new  Cuenta(0, 67890);
            float result= -1;
            
            
            System.out.println("2.- Withdraw $350 from account  #67890");
            cuenta2.retiro(350);
            System.out.println("4.- Withdraw $200 from account  #67890");
            cuenta2.retiro(200);
            System.out.println("5.- Withdraw $150 from account  #67890");
            cuenta2.retiro(150);
            System.out.println("7.- Deposit $50ninto account  #67890");
            result = cuenta2.ingreso(50);
            System.out.println("8.- Withdraw $100 from account  #67890");
            cuenta2.retiro(100);
            assertEquals(-250, result);
            System.out.println("El balance final de la cuenta 2 es:" + result);
        } catch (DatosIncorrectos ex) {
                    System.out.println(ex.getMessage());

//Logger.getLogger(CuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LimiteSaldo ex) {
            System.out.println(ex.getMessage());
//Logger.getLogger(CuentaTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
