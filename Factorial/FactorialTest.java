package com.factorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {
	FactorialMain f=new FactorialMain();
	@Test
	public void validateFive() {
		assertEquals(120,f.findFactoril(5));
	}
	@Test
	public void validateZero() {
		assertEquals(1,f.findFactoril(0));
	}
	@Test
	public void validateMinusTwo() {
		assertEquals(-1,f.findFactoril(-2) );
	}
}
