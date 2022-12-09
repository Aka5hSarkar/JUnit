package com.prime;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestPrimeNumber {
	@Test
	public void validateSeven() {
		assertEquals(true, FindPrime.validatePrime(7));
	}
	@Test
	public void validateTwentyOne() {
		assertEquals(false, FindPrime.validatePrime(21));
	}
	@Test
	public void validateZero() {
		assertEquals(false, FindPrime.validatePrime(0));
	}
	@Test
	public void validateOne() {
		assertEquals(false, FindPrime.validatePrime(1));
	}
	@Test
	public void validateNegative() {
		assertEquals(false, FindPrime.validatePrime(-3));
	}
}
