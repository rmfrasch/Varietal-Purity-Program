package vpdoc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * @author RYANF This case tests the size of the sample.
 */
public class VPTest1 {
	//creates objects for test
	VPForm a = new VPForm(500, 5);
	VPCalc aCalc = new VPCalc();

	@Before
	public void setUp() throws Exception {
	}

	/**
	 * If sample is 1000, then the sample is big enough
	 */
	@Test
	public void testValidSampleTrue() {
		a.setSampleSize(1000);
		assertTrue(aCalc.isSampleBigEnough(a));
	}

	/**
	 * If the sample is 99, then the sample is NOT big enough.
	 */
	@Test
	public void testValidSampleFalse() {
		a.setSampleSize(99);
		assertFalse(aCalc.isSampleBigEnough(a));
	}

}
