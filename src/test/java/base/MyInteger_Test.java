package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testisEven() {
		int testvalue = 8;
		MyInteger instance = new MyInteger(testvalue);
		boolean expected = true;
		boolean actual = instance.isEven();
		assertEquals("testisEven() failed", expected, actual);
	}
	@Test
	public void testisOdd() {
		int testvalue = 7;
		MyInteger instance = new MyInteger(testvalue);
		boolean expected = true;
		boolean actual = instance.isOdd();
		assertEquals("testisOdd() failed", expected, actual);
	}
	@Test
	public void testisPrime() {
		int testvalue = 5;
		MyInteger instance = new MyInteger(testvalue);
		boolean expected = true;
		boolean actual = instance.isPrime();
		assertEquals("testisPrime() failed", expected, actual);
	}
	@Test
	public void testequals() {
		int testvalue = 8;
		MyInteger instance = new MyInteger(testvalue);
		boolean expected = true;
		boolean actual = instance.equals(8);
		assertEquals("testequals() failed", expected, actual);
	}

}
