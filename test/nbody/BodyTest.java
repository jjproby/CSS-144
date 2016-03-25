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
public class BodyTest {
    
    public BodyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of move method, of class Body.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Vector f = null;
        double dt = 0.0;
        Body instance = null;
        instance.move(f, dt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }



    /**
     * Test of forceFrom method, of class Body.
     */
    @Test
    public void testForceFrom() {
        System.out.println("forceFrom");
        Body b = null;
        Body instance = null;
        Vector expResult = null;
        Vector result = instance.forceFrom(b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }




    }
    

