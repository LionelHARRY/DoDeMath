package com.dodemath.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GeneratorTest {
	private int minNumber;
	private int maxNumber;
	private int randomResult;

	@Before
	public void setUp() {
		minNumber = 6;
		maxNumber = 20;
		randomResult = minNumber + (int)(Math.random() * ((maxNumber - minNumber) + 1));
	}
	
	@Test
	public void notEqualRandoms() {
		
		for(int i = 0; i < 6; i ++) {
			assertNotEquals(randomResult, i);
		}

	}
}
