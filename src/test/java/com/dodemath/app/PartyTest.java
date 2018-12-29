package com.dodemath.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.dodemath.exec.MainExec;

public class PartyTest{

	private static Iparty party;
	
	@BeforeClass
	public static void initParty() {
		new MainExec();
		party = new Party();
		
	}
	
	@Before
	public void beforeTest() {
		//MainExec.getOkButton().setText("NO");
	}
	
	@Test 
	public void testBooleans() {
		//party.start();
		//assertTrue( MainExec.getLabel_for_PtsDPLable().isVisible());
		
	}
}
