package esof322.demos;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NumberTest {
	private Number number1;
	private Number number2;
	private Number number3;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		this.number1 = new Number(1);
		this.number2 = new Number(2);
		this.number3 = new Number(1);
	}

	@After
	public void tearDown() throws Exception {
		this.number1 = null;
		this.number2 = null;
		this.number3 = null;
	}
	
	@Test
	public void testNumber() {
		assertNotNull(this.number1);
		assertNotNull(this.number2);
		assertNotNull(this.number3);
	}
	@Test
	public void testEqualsObject() {
		assertFalse(number1.equals(number2));// testNotEquals()
		assertEquals(number1, number3);// testConsistent()
		assertNotSame(number1, number3);// testNotSame()

		assertFalse(number1.equals(null));// testNull()
		assertTrue(number1.equals(number3) == true && number3.equals(number1) == true);// testSymmeteric()
		assertEquals(number1, number1);// testReflexive()
	}

	@Test
	public void testHashCode() {
		//assert statements should only test one thing
		assertEquals("These should be equal", number1, number3);
		assertEquals("HashCodes should be equal", number1.hashCode(), number3.hashCode());
		assertEquals("HashCode should not change", number1.hashCode(), number1.hashCode());

	}
	


}
