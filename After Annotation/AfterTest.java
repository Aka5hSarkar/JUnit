package com.after;

import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.Test;

public class AfterTest {
	AfterMain a=new AfterMain();
	@Test
	public void vaidateFive() {
		assertTrue(a.validate(5));
	}
	@After
	public void printFact() {
		System.out.println(a.fact());
	}
}
