package test1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class testCase1 {
	
	testClass1 tc1;
	
	@Before
	public void setUp() {
		tc1 = new testClass1();
	}
	@Test
	public void testFib() {
		assertEquals(tc1.fib(10), 55);
	}

	@Test
	public void testPrime() {
		assertTrue(tc1.isPrime(19));
		assertFalse(tc1.isPrime(6));
	}

	@Test 
	public void testSearch() {
	 assertEquals(tc1.searchIndex(27), 2);
	 
	}

}
