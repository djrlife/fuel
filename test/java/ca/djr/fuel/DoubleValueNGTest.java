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
public class DoubleValueNGTest {
    
    public DoubleValueNGTest() {
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
     * Test of getValue method, of class DoubleValue.
     */
    @Test
    public void testGetValueUnsetException() {
        System.out.println("getValueUnsetException");
        DoubleValue instance = new DoubleValue();
        boolean exceptionFired = false;
        double result = 0.0;
        // confirm unset execption fires if DoubleValue is unset
        try {
            result = instance.getValue();
        }
        catch(DoubleValue.ValueUnsetException dvvue) {
            exceptionFired = true;
        }
        assertTrue(exceptionFired);
    }
    
    @Test
    public void testGetValue() {
        DoubleValue instance = new DoubleValue();
        // confirm setting a value indicates as set.
        double expResult = 0.0;
        double result = 0.0;
        instance.setValue(expResult);
        result = instance.getValue();
        boolean set = instance.isSet();
        
        assertEquals(result, expResult);
        assertTrue(set);
    }

    /**
     * Test of setValue method, of class DoubleValue.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        double value = 0.0;
        DoubleValue instance = new DoubleValue();
        instance.setValue(value);
        double result = instance.getValue();
        assertEquals(result,value);
    }

    /**
     * Test of isSet method, of class DoubleValue.
     */
    @Test
    public void testIsSetUnSet() {
        System.out.println("isSet");
        DoubleValue instance = new DoubleValue();
        boolean expResult = false;
        boolean result = instance.isSet();
        assertEquals(result, expResult);
    }

   
    @Test
    public void testIsSetSet() {
        System.out.println("isSetSet");
        DoubleValue instance = new DoubleValue();
        boolean expResult = true;
        instance.setValue(40.0);
        boolean result = instance.isSet();
        assertEquals(result, expResult);
    }
    
    /**
     * Test of unset method, of class DoubleValue.
     */
    @Test
    public void testUnset() {
        System.out.println("unset");
        DoubleValue instance = new DoubleValue();
        instance.setValue(22.94);
        instance.unset();
        assertFalse(instance.isSet());
    }
    
}
