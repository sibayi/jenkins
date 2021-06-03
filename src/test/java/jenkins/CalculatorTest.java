package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void addTest() {
		
		Integer expected = 15;
		Integer actual = Calculator.addNum(4, 11);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void addTest_aNull() {
		
		Integer expected = null;
		Integer actual = Calculator.addNum(null, 11);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void addTest_bNull() {
		
		Integer expected = null;
		Integer actual = Calculator.addNum(4, null);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void subTest() {
		
		Integer expected = 13;
		Integer actual = Calculator.subNum(24, 11);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void subTest_aNull() {
		
		Integer expected = null;
		Integer actual = Calculator.subNum(null, 11);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void subTest_bNull() {
		
		Integer expected = null;
		Integer actual = Calculator.subNum(4, null);
		
		assertEquals(expected, actual);
		
	}
	
}