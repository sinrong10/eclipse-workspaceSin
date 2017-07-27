package com.gtm.TestJUnit.tests;


import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import com.gtm.TestJUnit.metier.Operation;


public class OperationTest {
//* @Ignore*/
	
	@Test
	public void testAddition() {
		int resultat = Operation.addition(10, 12);
		Assert.assertEquals("erreur addition", 22, resultat, 0);
		
	}
	
	@Test
	public void testSoustraction() {
		int resultat = Operation.soustraction(10, 12);
		Assert.assertEquals("erreur soustraction", -2, resultat, 0);
		
	}
	
	@Test
	public void testMultiplication() {
		int resultat = Operation.multiplication(10, 12);
		Assert.assertEquals("erreur multiplication", 120, resultat, 0);
		
	}
	
	@Test
	public void testDivision() {
		int resultat = Operation.division(12, 10);
		Assert.assertEquals("erreur division", 1, resultat, 0);
		
	}

}
