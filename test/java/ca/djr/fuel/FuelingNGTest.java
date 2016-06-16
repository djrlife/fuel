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
    @Test(expectedExceptions = DoubleValue.ValueUnsetException.class)
    public void testGetCostUnset() {
        System.out.println("getCost");
        Fueling instance = new Fueling();
        instance.getCost().getValue();
        fail();
    }

    /**
     * Test of setTotalCost method, of class Fueling.
     */
    @Test
    public void testSetTotalCost() {
        System.out.println("setTotalCost");
        double cost = 123.45;
        Fueling instance = new Fueling();
        instance.setCost(cost);
        double result = instance.getCost().getValue();
        assertEquals(cost, result);
    }

    /**
     * Test of getPrice method, of class Fueling.
     */
    @Test(expectedExceptions = DoubleValue.ValueUnsetException.class)
    public void testGetPriceUnset() {
        System.out.println("getPrice");
        Fueling instance = new Fueling();
        instance.getPrice().getValue();
        fail();
    }

    /**
     * Test of setPrice method, of class Fueling.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 234.56;
        Fueling instance = new Fueling();
        instance.setPrice(price);
        double result = instance.getPrice().getValue();
        assertEquals(price, result);
    }

    /**
     * Test of getVolume method, of class Fueling.
     */
    @Test(expectedExceptions = DoubleValue.ValueUnsetException.class)
    public void testGetVolumeUnset() {
        System.out.println("getVolume");
        Fueling instance = new Fueling();
        instance.getVolume().getValue();
        fail();
    }

    /**
     * Test of setVolume method, of class Fueling.
     */
    @Test
    public void testSetVolume() {
        System.out.println("setVolume");
        double volume = 345.67;
        Fueling instance = new Fueling();
        instance.setVolume(volume);
        double result = instance.getVolume().getValue();
        assertEquals(volume, result);
    }

    /**
     * Test of resolved method, of class Fueling.
     */
    @Test
    public void testResolvedCostPrice() {
        System.out.println("resolvedCostPrice");
        Fueling instance = new Fueling();
        double cost = 10.0;
        double price = 1.019;
        instance.setCost(cost);
        instance.setPrice(price);
        boolean result = instance.resolved();
        assertEquals(result, true);
        
        double expectedVolume = cost / price;
        double volume = instance.getVolume().getValue();
        assertEquals(volume,expectedVolume);
    }
    
    /**
     * Test of resolved method, of class Fueling.
     */
    @Test
    public void testResolvedPriceVolume() {
        System.out.println("resolvedPriceVolume");
        Fueling instance = new Fueling();
        double price = .985;
        double volume = 20.2;
        instance.setPrice(price);
        instance.setVolume(volume);
        boolean result = instance.resolved();
        assertEquals(result, true);
        
        double expectedCost = price * volume;
        double cost = instance.getCost().getValue();
        assertEquals(cost,expectedCost);
    }

    /**
     * Test of resolved method, of class Fueling.
     */
    @Test
    public void testResolvedCostVolume() {
        System.out.println("resolvedCostVolume");
        Fueling instance = new Fueling();
        double cost = 30.5;
        double volume = 28.32;
        instance.setCost(cost);
        instance.setVolume(volume);
        boolean result = instance.resolved();
        assertEquals(result, true);
        
        double expectedPrice = cost / volume;
        double price = instance.getPrice().getValue();
        assertEquals(price,expectedPrice);
    }


        
}
