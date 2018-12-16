package com.dodemath.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratorTest {
	private static Igenerator generator;

	@BeforeClass
	public static void initGenerator() {
		generator = new Generator();
	}
	
	@Test
	public void testSum() {
		int result = generator.sum(3, 4);
		
		assertEquals(7, result);
	}
	
	@Test
	public void testMultiplication() {
		int result = generator.multiplication(2, 5);
		
		assertEquals(10, result);
	}
	
	@Test
	public void testDivision() {
		int result;
		try {
			result = generator.division(6, 2);
			assertEquals(3, result);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Cannot divide by 0");
			e.printStackTrace();
		}
		
	}
	
}
