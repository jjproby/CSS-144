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
public class UniverseTest {
    
    public UniverseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of increaseTime method, of class Universe.
     */
    @Test
    public void testIncreaseTime() {
        System.out.println("increaseTime");
        double dt = 0.0;
        Universe instance = null;
        instance.increaseTime(dt);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Universe.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Universe instance = null;
        instance.draw();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of textBody method, of class Universe.
     */
    @Test
    public void testTextBody() {
        System.out.println("textBody");
        Universe instance = null;
        instance.textBody();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Universe.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Universe.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
