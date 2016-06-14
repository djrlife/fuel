/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.djr.fuel;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author derek
 */
public class FuelingNGTest {
    
    public FuelingNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getCost method, of class Fueling.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Fueling instance = new Fueling();
        DoubleValue expResult = null;
        DoubleValue result = instance.getCost();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalCost method, of class Fueling.
     */
    @Test
    public void testSetTotalCost() {
        System.out.println("setTotalCost");
        double cost = 0.0;
        Fueling instance = new Fueling();
        instance.setTotalCost(cost);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Fueling.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Fueling instance = new Fueling();
        DoubleValue expResult = null;
        DoubleValue result = instance.getPrice();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Fueling.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Fueling instance = new Fueling();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVolume method, of class Fueling.
     */
    @Test
    public void testGetVolume() {
        System.out.println("getVolume");
        Fueling instance = new Fueling();
        DoubleValue expResult = null;
        DoubleValue result = instance.getVolume();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setVolume method, of class Fueling.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        double volume = 0.0;
        Fueling instance = new Fueling();
        instance.setVolume(volume);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resolved method, of class Fueling.
     */
    @Test
    public void testResolved() {
        System.out.println("resolved");
        Fueling instance = new Fueling();
        boolean expResult = false;
        boolean result = instance.resolved();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

        
}
