/**
 * @author Blake Dykstra - bdykstra
 * CIS175 - Spring 2024
 * Jan 28, 2024
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Webnovel;

/**
 * 
 */
public class TestWN2 {
	Webnovel webnovel2 = new Webnovel("Archeon Eon Art");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSetCompleted() {
		webnovel2.setChapters(766);
		webnovel2.setChaptersPerWeek(7);
		webnovel2.setCompleted(true);
		assertEquals(0, webnovel2.getChaptersPerWeek());
	}
	
	@Test
	public void testCompleted() {
		assertFalse(webnovel2.isCompleted());
	}
	
	@Test
	public void testNotVeryLong() {
		webnovel2.setChapters(50);
		assertEquals("Not very long.", webnovel2.howLong());
	}
	
	@Test
	public void testKindOfLong() {
		webnovel2.setChapters(350);
		assertEquals("Kind of long.", webnovel2.howLong());
	}
	
	@Test
	public void testPrettyLong() {
		webnovel2.setChapters(766);
		assertEquals("Pretty long.", webnovel2.howLong());
	}
	
	@Test
	public void testVeryLong() {
		webnovel2.setChapters(1000);
		assertEquals("Very long.", webnovel2.howLong());
	}

}
