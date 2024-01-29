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
public class TestWN1 {
	Webnovel shadowSlave = new Webnovel("Shadow Slave");

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testChapterProjection() {
		shadowSlave.setChapters(1412);
		shadowSlave.setChaptersPerWeek(15);
		assertEquals(1442, shadowSlave.chapterProjection(2));
	}
	
	@Test
	public void testChapterProjection2() {
		shadowSlave.setChapters(1412);
		shadowSlave.setChaptersPerWeek(15);
		assertEquals(2912, shadowSlave.chapterProjection(100));
	}
	
	@Test
	public void testHowLong() {
		shadowSlave.setChapters(1412);
		assertNotNull(shadowSlave.howLong());
	}

}
