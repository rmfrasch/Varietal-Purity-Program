package vpdoc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author RYANF This is to test the percentages of off-types in the seed
 *         sample.
 *
 */
public class VPTest2 {
	// Create objects for tests
	VPForm a = new VPForm(500, 5);
	VPCalc aCalc = new VPCalc();

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * To test if if the percentage off-types of 5 out of 100 is equal to
	 * PERCENTAGE_TO_PASS, with a tolerance of 0.0.
	 */
	@Test
	public void testPercentOffType() {
		aCalc.isPassing(a);
		assertEquals(aCalc.getPercentOffType(), aCalc.getPERCENTAGE_TO_PASS(), 0.0);
	}

	/**
	 * To test if the 6 off-types out of 500 is within the 0.01 threshold. Its not,
	 * and should be false.
	 */
	@Test
	public void testIsPassingFalse() {
		a.setOffTypeNum(6);
		assertFalse(aCalc.isPassing(a));
	}

	/**
	 * To test if 5 off-types out of 500 is within the 0.01 threshold. It is, and
	 * should be true.
	 */
	@Test
	public void testIsPassingTrue() {
		a.setOffTypeNum(5);
		assertTrue(aCalc.isPassing(a));
	}

}
