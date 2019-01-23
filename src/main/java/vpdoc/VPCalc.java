package vpdoc;

/**
 * @author RYANF This is used to calculated the percentage of off-types in a
 *         sample, as well as determining if the test passed or not.
 *
 */
public class VPCalc {
	// Sample needs to be large enough to be able to accommodate a 0.01 percentage
	// off-types, which is 1 out of 100 seed. So if the sample is 99 seeds, the
	// sample is not large enough to accommodate even one off-type seed.
	private final double PERCENTAGE_TO_PASS = 0.01;
	private boolean isPassing, validSample;
	private double percentOffType;

	/**
	 * @param a The variety purity object
	 * @return true if the sample is larger than 100, else false
	 */
	public boolean isSampleBigEnough(VPForm a) {
		if (a.getSampleSize() < 100) {
			validSample = false;
		} else {
			validSample = true;
		}
		return validSample;
	}

	/**
	 * @param a The variety purity object
	 * @return true if the sample passes the test, else false.
	 */
	public boolean isPassing(VPForm a) {

		percentOffType = (double) a.getOffTypeNum() / a.getSampleSize();
		;

		if (percentOffType <= PERCENTAGE_TO_PASS) {
			isPassing = true;
		} else {
			isPassing = false;
		}
		return isPassing;
	}

	// Getters
	public double getPercentOffType() {
		return percentOffType;
	}

	public double getPERCENTAGE_TO_PASS() {
		return PERCENTAGE_TO_PASS;
	}

}
