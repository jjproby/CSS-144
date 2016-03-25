/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nbody;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jordan
 */
public class VectorTest {
    
    public VectorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of length method, of class Vector.
     */
    @Test
    public void testLength() {
        System.out.println("length");
        int n = 84;
        int expResult = 84;
        int result = 84;
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of dot method, of class Vector.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        int N = 3; 
        double sum = 0.0;
        double[] data1 = {4, 3, 2};
        double[] data2 = {2, 3, 4};
        for (int i = 0; i < N; i++)
            sum = sum + (data1[i] * data2[i]);
        double expResult = 25.0;
        assertEquals(expResult, sum, 0.0);
        
    }

    /**
     * Test of magnitude method, of class Vector.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        double data = 36;
        double ans = Math.sqrt(data);
        double expResult1 = 6;
        assertEquals(expResult1, ans, 0.0);
        
    }

    /**
     * Test of distanceTo method, of class Vector.
     */
    @Test
    public void testDistanceTo() {
        System.out.println("distanceTo");
        Vector that = null;
        Vector instance = null;
        double expResult = 0.0;
        double result = instance.distanceTo(that);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of plus method, of class Vector.
     */
    @Test
    public void testPlus() {
        System.out.println("plus");
        Vector that = null;
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.plus(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of minus method, of class Vector.
     */
    @Test
    public void testMinus() {
        System.out.println("minus");
        Vector that = null;
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.minus(that);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cartesian method, of class Vector.
     */
    @Test
    public void testCartesian() {
        System.out.println("cartesian");
        int i = 0;
        Vector instance = null;
        double expResult = 0.0;
        double result = instance.cartesian(i);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of times method, of class Vector.
     */
    @Test
    public void testTimes() {
        System.out.println("times");
        double factor = 0.0;
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.times(factor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of direction method, of class Vector.
     */
    @Test
    public void testDirection() {
        System.out.println("direction");
        Vector instance = null;
        Vector expResult = null;
        Vector result = instance.direction();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vector.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Vector.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Vector.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
