package com.dodemath.app;
//import org.junit.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainTest extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
	public MainTest(String testName) {
		super(testName);
	}
	
	/**
     * @return the suite of tests being tested
     */
    public static Test suite(){
        return new TestSuite( MainTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp(){
        assertTrue( true );
    }
    
    //@Test
    public void testAdd() {
       //test data
       int num = 5;
       String temp = null;
       String str = "Junit is working fine";

       //check for equality
       assertEquals("Junit is working fine", str);
       
       //check for false condition
       assertFalse(num == 6);

       //check for not null value
       //assertNotNull(temp);
    }
}
