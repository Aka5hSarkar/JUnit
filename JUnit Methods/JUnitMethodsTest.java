package com.junit_methods;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
public class JUnitMethodsTest {
	JUnitMethodsMain jm=new JUnitMethodsMain();
	ArrayList <String > arr=new ArrayList<String>() {{
		add("Akash");
		add("Arnab");
		add("Dev");
	}
	};
	
	@Test
	public void validateEvenFour() {
		assertEquals(true, jm.even(4));
	}
	@Test
	public void validateOddFive() {
		assertTrue(jm.odd(5));
	}
	@Test
	public void validateOddSix() {
		assertFalse(jm.odd(6));
	}
	@Test
	public void compareArrays() {
		assertArrayEquals(jm.createArray(1,5),jm.createArray(1,5));
	}
	
	@Test
	public void searchPresentItem() {
		assertNotNull(jm.searchArrayList(arr,"Dev"));
	}
	@Test
	public void searchNotPresentItem() {
		assertNull(jm.searchArrayList(arr,"Deep"));
	}
	
}
